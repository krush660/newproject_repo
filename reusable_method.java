package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reusable_method {

    WebDriver driver;

    public void lunchapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.facebook.com/");
    }

    public void closeapp() {
        {
            driver.close();
        }
    }

 
    
}

	
	
	
	
	
