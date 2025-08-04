package auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreenShotAutomation {
	
		
		public static void main(String[] args) throws InterruptedException, IOException {
			
		       System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		        // Create an instance of EdgeDriver
		        WebDriver driver = new EdgeDriver();




	        driver.get("https://simple.wikipedia.org/wiki/Urvashi_Rautela#/media/File:Urvashi-Rautela-12th-Radio-Mirchi-Music-awards-2020-12_(cropped).jpg");
	        
	        
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File("C:\\Users\\hp\\OneDrive\\Desktop\\urvashi.png"));
		
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		
		driver.close();
	}
	
	
	
}
	
	
	