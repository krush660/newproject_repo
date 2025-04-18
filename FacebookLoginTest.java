package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginTest {
    
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"email1@example.com", "password1"},
            {"email2@example.com", "password2"},
            {"email3@example.com", "password3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String email, String password) {
 	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        
        // Add your verification code here
        
        driver.quit();
    }
}
