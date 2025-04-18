package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.facebook.com/");
        
        driver .manage().window().maximize();
        
       WebElement email= driver.findElement(By.id("email"));
       
       WebElement pass= driver.findElement(By.id("pass"));
      
       pass.isEnabled();
       email.isEnabled();
       System.out.println(pass);
       System.out.println(email);



	}

	public void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}
}
