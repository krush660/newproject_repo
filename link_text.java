package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text {
	
	   public static void main(String[] args) {
	        // Setting the system property for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	        // Creating an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Opening a website (example: Google)
	        driver.get("https://www.flipkart.com/nothing-phone-2a-plus-black-256-gb/p/itm0c99b11bfe22d?pid=MOBH322WW3NZ5HRY&lid=LSTMOBH322WW3NZ5HRYYJUQKV&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_3&otracker=browse&fm=organic&iid=5f8ca956-709f-4556-b7ee-2978c13d6e56.MOBH322WW3NZ5HRY.SEARCH&ppt=hp&ppn=homepage&ssid=o1x7cxx5q80000001733412656353");
	        
	       List<WebElement> link= driver.findElements(By.tagName("a"));
	       
	       System.out.println(link.size());
	       

}
}