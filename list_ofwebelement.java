package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list_ofwebelement {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/b?node=1389432031");
		Thread.sleep(4000);
		
		List<WebElement> weblementref =driver.findElements(By.tagName("a"));
		
		for(WebElement   e:weblementref) {
			
			System.out.println(e.getText());
		}
		
		
		
		
	}
	

}
