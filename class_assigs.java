package auto;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Properties;

public class class_assigs {

    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void setup() {
        prop = ConfigReader.getProperties();

        System.setProperty("webdriver.edge.driver", prop.getProperty("driverPath"));
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

        // Login using config values
        driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.id("login-button")).click();
    }

    @Test(dataProvider = "sortOptions")
    public void filterAndAddToCart(String sortOption) throws InterruptedException {
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.findElement(By.xpath("//option[text()='" + sortOption + "']")).click();
        Thread.sleep(1000);

        List<WebElement> titles = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        WebElement addButton = driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[1]"));
        String selectedProduct = titles.get(0).getText();
        String selectedPrice = prices.get(0).getText();
        addButton.click();

        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        String cartTitle = driver.findElement(By.className("inventory_item_name")).getText();
        String cartPrice = driver.findElement(By.className("inventory_item_price")).getText();
        String quantity = driver.findElement(By.className("cart_quantity")).getText();

        System.out.println("🔍 Verifying Cart for Sort Option: " + sortOption);
        System.out.println("✅ Product: " + cartTitle);
        System.out.println("✅ Price: " + cartPrice);
        System.out.println("✅ Quantity: " + quantity);

        assert cartTitle.equals(selectedProduct);
        assert cartPrice.equals(selectedPrice);
        assert quantity.equals("1");

        driver.navigate().back(); // For next test
    }

    @Test(dependsOnMethods = "filterAndAddToCart")
    public void extractTop3Products() {
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.findElement(By.xpath("//option[text()='Name (Z to A)']")).click();

        List<WebElement> titles = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        System.out.println("\n📦 Top 3 Products after 'Name Z to A' sort:");
        for (int i = 0; i < Math.min(3, titles.size()); i++) {
            System.out.println("Product: " + titles.get(i).getText() + " | Price: " + prices.get(i).getText());
        }
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @DataProvider(name = "sortOptions")
    public Object[][] getSortOptions() {
        return new Object[][]{
                {"Price (low to high)"},
                {"Price (high to low)"},
                {"Name (A to Z)"}
        };
    }
}
