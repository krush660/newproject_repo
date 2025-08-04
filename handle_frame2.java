package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_frame2 {

	
	public static void main(String[] args) {
		
		   // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website
        driver.get("https://docs.oracle.com/javase/7/docs/api/");
        
       WebElement f1 = driver.findElement(By.name("packageListFrame"));
      
       
      List<WebElement>  lc= driver.switchTo().frame(f1).findElements(By.tagName("a"));
       
       for(WebElement ref :lc) {
    	   
    	   System.out.println(ref.getText());
    	   
       }
        
        
        
        
		
		
		
	}
}
