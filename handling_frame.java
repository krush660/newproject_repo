package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_frame {
	
	
	 public static void main(String[] args) {
	        // Setting the system property for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Opening a website (example: Google)
	        driver.get("https://docs.oracle.com/javase/7/docs/api/");
	        
	   	        
	    WebElement f1 = driver.findElement(By.name("packageListFrame"));
	       
	        driver.switchTo().frame(f1).findElement(By.xpath("//a[text()='java.applet' and @target='packageFrame']")).click();
	       
	       
	       
	        
	
	
	
	 }
	

}
