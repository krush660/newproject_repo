package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class handling_webtablew {
    public static void main(String[] args) {
        // Set up WebDriver path (change path as per your system)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the target URL
        driver.get("https://money.rediff.com/indices/bse/bankex");
        
        driver.manage().window().maximize();

        // Locate the table
        WebElement table = driver.findElement(By.xpath("//table"));

        // Get all rows of the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Iterate over rows
        for (WebElement row : rows) {
            // Get all columns of each row
            List<WebElement> cols = row.findElements(By.tagName("td"));

            // Iterate over columns and print data
            for (WebElement col : cols) {
                System.out.print(col.getText() + "  |  ");
            }
            System.out.println(); // New line after each row
        }

        // Close the driver
        driver.quit();
    }
}
