package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basic_problems {
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
	       System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

	        // Create an instance of EdgeDriver
	        WebDriver driver = new EdgeDriver();


        // Opening a website (example: Google)
        driver.get("https://www.facebook.com/");
        
        driver .manage().window().maximize();
        
        
        
       driver .findElement(By.name("email")).sendKeys("bdf nxhsd");
       driver .findElement(By.name("pass")).sendKeys("bdf nxhsd");
       driver .findElement(By.name("login")).click();
       driver .findElement(By.name("email")).clear();
       Thread.sleep(4000);

       driver .findElement(By.name("pass")).clear();
       Thread.sleep(4000);
       driver.close();
       driver.get("https://www.facebook.com/");
       driver .findElement(By.name("email")).sendKeys("bjvyygy g");
       driver .findElement(By.name("pass")).sendKeys("bdf");
       driver.close();

       
       

       
	}
}
