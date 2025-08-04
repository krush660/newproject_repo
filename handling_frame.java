package auto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_frame {
    public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website
        driver.get("https://docs.oracle.com/javase/7/docs/api/");

        // Switching to the first frame and performing action
        WebElement f1 = driver.findElement(By.name("packageListFrame"));
        driver.switchTo().frame(f1).findElement(By.xpath("//a[text()='java.applet' and @target='packageFrame']")).click();

        // Switch back to default content before switching to another frame
        driver.switchTo().defaultContent();
        Thread.sleep(4000);

        // Switching to the second frame and performing action
        WebElement f2 = driver.findElement(By.name("packageListFrame"));
        driver.switchTo().frame(f2).findElement(By.xpath("//a[text()='java.awt' and @target='packageFrame']")).getText();
        f2.click();

        // Finally, close the driver
      //  driver.quit();
    }
}
