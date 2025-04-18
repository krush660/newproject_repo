package auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screen_Shot {
	
		
		public static void main(String[] args) throws InterruptedException, IOException {
	        // Setting the system property for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhytf-CqY2rrodflaUNrsym6eMnhGAlSRnOE2yrvaaltT_wy5yArVnf5u2eKJZj4BnBcA41lJY2z8dDyVp5FwCC22FYleU-dP0aYnLL1Qg71e7B7lejkx3ARM6VKXhFHP5N1Lqey4sglSwI/s1600/Urvashi_Sharma_Diamond_Set_withPearls.JPG");
	        
	        
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f,new File("C:\\Users\\hp\\OneDrive\\Desktop\\New folder\\urvashisharma.png"));
		
		//driver.close();
	}
	
	
	
	
	
	
	

}
