package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_comand {
	
	
	
	   public static void main(String[] args) throws InterruptedException {
	        // Setting the system property for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        driver.navigate().to("https://www.facebook.com/");
             driver.manage().window().maximize();
             Thread.sleep(1500);
	         driver.navigate().back();
	         driver.navigate().forward();
	         driver.navigate().refresh();
	         driver.navigate().back();
	         driver.navigate().forward();
	        
driver.close();

	       
	
	   }
}
