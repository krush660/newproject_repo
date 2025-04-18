package auto;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronizat {
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       driver.manage().window().maximize();
         Thread.sleep(2000);
        driver.get("https://money.rediff.com/indices/bse/bankex");
        //
        driver.get("https://www.facebook.com/");
        
       WebDriverWait w = new WebDriverWait(driver,5);
       
       w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 50));
       
       
       driver.close();
        
        
	
	
	}

}
