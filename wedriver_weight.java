package auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wedriver_weight {
	
	public static void main(String[] args) {
		
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      WebDriverWait wait=new WebDriverWait(driver, 4);
    //  Alert element=wait.until(ExpectedConditions.alertIsPresent());
     
      
      driver.findElement(By.id("email")).sendKeys("krushnal");
      driver.findElement(By.id("pass")).sendKeys("dineakr");
      
      

      
	}
	

}
