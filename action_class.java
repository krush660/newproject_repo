package auto;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {
	  public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver(); 
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.naukri.com/mnjuser/performance");
	        
	        WebElement nawkri = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/nav/ul/li[2]/a/div"));
	        
Actions ac =new Actions(driver);

ac.moveToElement(nawkri).perform();
	        
	
	
	  }
}
