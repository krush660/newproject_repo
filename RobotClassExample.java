package auto;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassExample {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser
        driver.manage().window().maximize();
        
        // Navigate to the login page
        driver.get("https://www.naukri.com/nlogin/login?URL=//www.naukri.com/mnjuser/profile?id=&altresid");
        
        // Example: Entering text into the username field
        WebElement usernameField = driver.findElement(By.id("usernameFieldId")); // Replace with actual `id` or `xpath`
        usernameField.sendKeys("yourUsername");
        
        // Example: Entering text into the password field
        WebElement passwordField = driver.findElement(By.id("passwordFieldId")); // Replace with actual `id` or `xpath`
        passwordField.sendKeys("yourPassword");
        
        // Using Robot Class for a system-level action, like pressing ENTER
        Robot robot = new Robot();
        
        // Simulating pressing the ENTER key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        // Wait to observe the action
        Thread.sleep(2000);

        // Closing the browser
        driver.quit();
    }
}
