package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Opening a website (example: Google)
	        driver.get("https://www.facebook.com/r.php");
	        
	        driver .manage().window().maximize();
	        
	        Select  index =new Select(driver.findElement(By.id("day")))	;  
	        
	        index.selectByIndex(10);
	        System.out.println(index);
	        
	         String e=index.getFirstSelectedOption().getText();
	        
	         
	         System.out.println(e);
	         
		        Select  visible =new Select(driver.findElement(By.id("month")))	;  
		        
		        visible.selectByVisibleText("Mar");
		       String finaloutput = visible.getFirstSelectedOption().getText();
		       
		       System.out.println(finaloutput);
		       
		       
		       
		        Select  value =new Select(driver.findElement(By.id("year")))	;  
		        
		        value.selectByValue("1999");
		       String finaloutput2 = value.getFirstSelectedOption().getText();
		       
		       System.out.println(finaloutput2);
		       
		       
		       
		       
		       
		       
		      // driver.close();
		        

	        
	        
	        
	        
	}
	

}
