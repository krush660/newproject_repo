package auto;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.util.List;

public class class_assign {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(dataProvider = "sortOptions")
    public void filterAndAddToCart(String sortOption) throws InterruptedException {
        // Sort using A
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.findElement(By.xpath("//option[text()='" + sortOption + "']")).click();
        Thread.sleep(1000);

        // Get all products
        List<WebElement> titles = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        // Add the first (cheapest or sorted top) item to cart
        WebElement addButton = driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[1]"));
        String selectedProduct = titles.get(0).getText();
        String selectedPrice = prices.get(0).getText();
        addButton.click();

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        // Verify product in cart
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

        driver.navigate().back(); // Go back for Task 2
    }

    @Test(dependsOnMethods = "filterAndAddToCart")
    public void extractTop3Products() {
        // Sort by Name Z to A
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.findElement(By.xpath("//option[text()='Name (Z to A)']")).click();

        // Get first 3 products
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
