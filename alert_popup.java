package auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert_popup {
	
	 public static void main(String[] args) {
	        // Setting the system property for the ChromeDriver
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");


	        // Creating an instance of ChromeDriver
	        WebDriver driver = new EdgeDriver();

	        // Opening a website (example: Google)
	        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        
	        driver.findElement(By.name("proceed")).click();
	        
	     driver.switchTo().alert().dismiss();
}
}
//https://mail.rediff.com/cgi-bin/login.cgi