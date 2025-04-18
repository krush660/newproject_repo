package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url_contai {
	
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.facebook.com/");
        
        driver .manage().window().maximize();
        
        String url=driver.getCurrentUrl();

        System.out.println(url);
        
   String  placeholder=driver.findElement(By.id("email")).getAttribute("placeholder") ;  
   
   System.out.println(placeholder);

   
        if (url.contains(".com")) {
        	
        	System.out.println("true");
			
		} else {
        	System.out.println("false");


		}
        
	

}
}