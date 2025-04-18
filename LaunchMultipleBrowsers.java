package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMultipleBrowsers {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Creating instances of ChromeDriver and EdgeDriver
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver edgeDriver = new EdgeDriver();

        // Opening a website in Chrome
        chromeDriver.get("https://www.google.com");

        // Opening a website in Edge
        edgeDriver.get("https://www.bing.com");

        // Perform any additional actions here...

        // Closing the browsers
        chromeDriver.quit();
        edgeDriver.quit();
    }
}
