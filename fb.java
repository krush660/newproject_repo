package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to Facebook
        driver.get("https://www.facebook.com/");
        
        // Original text
        String originalText = "swapnil";
        
        // Replacing text
        String replacedText = originalText.replace("swapnil", "krushnal");

        // Input email and password
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(replacedText);
       Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(replacedText);

        // Wait for 4 seconds
        Thread.sleep(4000);
        
        // Close the browser
        driver.close();
    }
}
