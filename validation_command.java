package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation_command {

    public static void main(String[] args) throws InterruptedException {

        // Set the path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Enter login credentials
        driver.findElement(By.name("email")).sendKeys("bdf nxhsd");
        driver.findElement(By.name("pass")).sendKeys("bdf nxhsd");
        driver.findElement(By.name("login")).click();

        // Perform validations
        boolean isEmailDisplayed = driver.findElement(By.name("email")).isDisplayed();
        boolean isEmailSelected = driver.findElement(By.name("email")).isSelected();
        Dimension loginSize = driver.findElement(By.name("login")).getSize();
        String loginTag = driver.findElement(By.name("login")).getTagName();
        boolean isEmailEnabled = driver.findElement(By.name("email")).isEnabled();
        boolean isLoginDisplayed = driver.findElement(By.name("login")).isDisplayed();

        // Print validation results
        System.out.println("Is email displayed: " + isEmailDisplayed);
        System.out.println("Is email enabled: " + isEmailEnabled);
        System.out.println("Is login button displayed: " + isLoginDisplayed);
        System.out.println("Is email selected: " + isEmailSelected);
        System.out.println("Login button size: " + loginSize);
        System.out.println("Login button tag name: " + loginTag);

        // Get page info
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();

        System.out.println("Title of Facebook page: " + title);
        System.out.println("URL of Facebook page: " + url);
        System.out.println("Page Source length: " + pageSource.length());

        // Close the browser
        driver.close();
    }
}
