package auto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby {
    public static void main(String[] args) throws InterruptedException {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Open Facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        // Log in (if required) and navigate where scrolling is needed

        // Use JavaScript Executor to scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        for (int i = 0; i < 5; i++) { // Scroll 5 times
            js.executeScript("window.scrollBy(0, 100);"); // Scroll down by 500 pixels
            Thread.sleep(2000); // Wait to load content

        }

       
        
        
        // Close the browser
        driver.quit();
    }
}
