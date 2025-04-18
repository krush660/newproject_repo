package auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.freepik.com/photos/nature");
File  f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Files.copy(f,new File("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\New folder\\\\nauture.png"));
Thread.sleep(4000);
driver.close();



		
		
	}
	


}