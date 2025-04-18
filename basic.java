package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.amazon.in/b?node=1389432031");
        
        driver .manage().window().maximize();
        
        
        driver.findElement(By.className("a-size-base a-color-base apb-browse-refinements-indent-1 a-text-bold")).click();
        

	}
	
}
