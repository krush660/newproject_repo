package auto;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {
	  public static void main(String[] args) throws InterruptedException, AWTException {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

	        // Create an instance of EdgeDriver
	        WebDriver driver = new EdgeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://www.naukri.com/mnjuser/performance");
	        
	        WebElement jobs = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/nav/ul/li[1]/a/div"));
	        
//Actions ac =new Actions(driver);

//ac.moveToElement(jobs).perform();
//ac.sendKeys(Keys.CONTROL, "n").perform();
//ac.contextClick(jobs).perform();
//ac.sendKeys(Keys.CONTROL, "T").perform();
Robot robo=new Robot();
robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_T);
robo.keyRelease(KeyEvent.VK_CONTROL);
robo.keyRelease(KeyEvent.VK_T);
Thread.sleep(3000);
//driver.close();
	        
	
	
	  }
}
