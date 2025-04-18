package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_ {
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
        driver.get("https://money.rediff.com/indices/bse/bankex");
        
        WebElement datatable = driver.findElement(By.xpath("//*[@class='dataTable']"));
        
       List<WebElement> bankname = datatable.findElements(By.tagName("a"));
       
       for (WebElement ref : bankname) {
    	   
    	   System.out.println(ref.getText());
		
	}
        driver.close();
	}
}
