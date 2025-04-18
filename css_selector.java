package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {
	
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.facebook.com/");
        
        
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(" kwerfvj fnd");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys(" kwerfvj fnd");

	
	}

}
