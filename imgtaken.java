package auto;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class imgtaken {
	
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");

	    
	    Actions ac =new Actions(driver);
	    WebElement e1 =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/span/span[1]"
	    		));
	    ac.moveToElement(e1).perform();
	    
	    WebElement e2=  driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
	    ac.moveToElement(e2).perform();

	    WebElement e3=  driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));

e3.click();
List<WebElement> ss=driver.findElements(By.xpath("//img[@class='DByuf4' and @loading='eager' and  @alt='Canon EOS 3000D DSLR Camera 1 Body, 18 - 55 mm Lens']"));
System.out.println(ss.size());
driver.close();

	}

}
