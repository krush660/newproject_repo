package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class time_LAPS {
	
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

      // Creating an instance of ChromeDriver
      WebDriver driver = new ChromeDriver();

      // Opening a website (example: Google)
      driver.get("https://fast.com/");
      
      
     WebElement a= driver.findElement(By.id("speed-value"));
     WebElement a1= driver.findElement(By.id("speed-units"));
     Thread.sleep(3000);
     System.out.println(a.getText()+a1.getText());
     driver.close();
     

}
	
	

}
