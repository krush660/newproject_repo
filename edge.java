package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

    public static void main(String[] args) {
        // Set the path to the EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        // Creating an instance of EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Opening a website (example: Google)
        driver.get("https://www.google.com");

        // Closing the browser
        //driver.quit();
    }
}
