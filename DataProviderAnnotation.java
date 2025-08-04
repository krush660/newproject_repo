package auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {

	 WebDriver driver;

	    @BeforeMethod
	    public void launchApp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");

	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @AfterMethod
	    public void closeApp() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @DataProvider(name = "testdata")
	    public Object[][] data() {
	        return new Object[][]{
	                {"krushnaldinekar", "krushnal@12345"},
	                {"testuser1", "password123"},
	                {"testuser2", "password456"}
	        };
	    }

	    @Test(dataProvider = "testdata")
	    public void loginCredentials(String uid, String pwd) {
	        driver.findElement(By.id("email")).sendKeys(uid);
	        driver.findElement(By.id("pass")).sendKeys(pwd);

	        System.out.println("Login attempted with: " + uid + " / " + pwd);
	    }
	}
