package auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup {
	
	 public static void main(String[] args) {
	        // Setting the system property for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Opening a website (example: Google)
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        
	        driver.findElement(By.name("proceed")).click();
	        
	       Alert a= driver.switchTo().alert();
	       a.dismiss();
	        

}
}
//https://mail.rediff.com/cgi-bin/login.cgi