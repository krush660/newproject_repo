package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class flifkart {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the Flipkart camera accessories page
        driver.get("https://www.flipkart.com/camera-accessories/camera-lenses/pr?sid=jek,6l2,e9y&q=camera+accessories&otracker=categorytree");

        // Initialize FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))  // Max wait time
                .pollingEvery(Duration.ofSeconds(2)) // Check every 2 sec
                .ignoring(Exception.class); // Ignore exceptions

        // Close the login popup
      

        // Click on "Electronics"
        WebElement electronicsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Electronics']")));
        electronicsMenu.click();

        // Click on "Camera"
        WebElement cameraMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cameras']")));
        cameraMenu.click();

        // Click on "DSLR & Mirrorless"
        WebElement dslrMirrorless = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='DSLR & Mirrorless']")));
        dslrMirrorless.click();

        // Quit the browser
        driver.quit();
    }
}