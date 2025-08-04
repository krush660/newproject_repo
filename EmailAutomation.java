package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAutomation {
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        
        driver .manage().window().maximize();
        
        
	}
}
