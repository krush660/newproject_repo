package auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass {
	
	  public static void main(String[] args) throws InterruptedException, AWTException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver(); 
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.naukri.com/mnjuser/performance");
	        
	        WebElement nawkri = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/nav/ul/li[2]/a/div"));
	        
	        Robot robot = new Robot();

	        // Simulating Ctrl+T (New Tab)
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(4000);


driver.close();
	        
	  }
	  
}
