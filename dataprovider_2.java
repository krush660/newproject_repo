package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class dataprovider_2 {

    WebDriver driver;

    @BeforeMethod
    public void launchApp() {
        // Set up the ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    //.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the Facebook URL
        driver.get("https://www.facebook.com/");
    }

    @AfterMethod
    public void closeApp() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "testdata")
    public Object[][] data() {
        // Test data for username and password
        return new Object[][]{
                {"testuser1@example.com", "password1"},
                {"testuser2@example.com", "password2"},
                {"testuser3@example.com", "password3"}
        };
    }

    @Test(dataProvider = "testdata")
    public void loginWithDynamicXPath(String username, String password) {
        // Dynamic XPath templates with placeholders
        String usernameXPathTemplate = "//input[@id='{id}']";
        String passwordXPathTemplate = "//input[@id='{id}']";

        // Replace placeholders with actual IDs
        String usernameXPath = usernameXPathTemplate.replace("{id}", "email");
        String passwordXPath = passwordXPathTemplate.replace("{id}", "pass");

        // Locate the username and password fields
        WebElement usernameField = driver.findElement(By.xpath(usernameXPath));
        WebElement passwordField = driver.findElement(By.xpath(passwordXPath));

        // Enter the username and password
        usernameField.clear();
        usernameField.sendKeys(username);

        passwordField.clear();
        passwordField.sendKeys(password);

        // Log the action
        System.out.println("Login attempted with Username: " + username + " and Password: " + password);
    }
}
