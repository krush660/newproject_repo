package auto;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handled_table {
    public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://money.rediff.com/indices/bse/bankex");

        // Locate the table
        WebElement datatable = driver.findElement(By.className("dataTable"));

        // Find all table rows (tr)
        List<WebElement> rows = datatable.findElements(By.tagName("tr"));

        // Print each row
        for (WebElement row : rows) {
            System.out.println(row.getText()); // Prints the full row data
        }

        // Close the browser
        driver.quit();
    }
}
