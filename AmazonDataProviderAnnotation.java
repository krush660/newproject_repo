package auto;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonDataProviderAnnotation {
    
    WebDriver driver;

    @AfterMethod
    public void closeApp() {
        if (driver != null) {
            driver.close();
        }
    }

    @DataProvider(name = "search")
    public Object[][] searchData() {
        return new Object[][] {
            {"mouse"},
            {"book"},
            {"shoe"}
        };
    }

    @Test(dataProvider = "search")
    public void launchApp(String searchItem) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchItem + Keys.ENTER);
        
        // Add any additional code for verification or further actions
        
    }
    
}
