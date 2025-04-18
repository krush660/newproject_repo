package auto;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class re2 {
	   WebDriver driver;

	    public void lunchapp1(String url) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Creating an instance of ChromeDriver
	        driver = new ChromeDriver(); 
	        
	        driver.manage().window().maximize();
	        driver.get(url);
	    }

	

	    public void closeapp() {
	        {
	            driver.close();
	        }
	    }

	    public void  isenable(String loc) {
	    	
	    	boolean e =driver.findElement(By.id(loc)).isDisplayed();
	    	
	    	if (e==true) {
	    		
	    		System.out.println("true");
				
			} else {
	    		System.out.println("false");


			}
	    	
	    }

	    public void  isdispalyes(String loc1) {
	    	
	    	boolean d =driver.findElement(By.id(loc1)).isDisplayed();
	    	
	    	if (d==true) {
	    		
	    		System.out.println("true");
				
			} else {
	    		System.out.println("false");
	    		
	    		
	    	}
	    }
	   
	
}


