package auto;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handing_frame_single {

    public static void main(String[] args) throws InterruptedException {
        // Set path for ChromeDriver
    	 System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

	        // Create an instance of EdgeDriver
	        WebDriver driver = new EdgeDriver();

        driver.get("https://money.rediff.com/indices/bse/bankex");

        // Locate the table using class name
        WebElement datatable = driver.findElement(By.className("dataTable"));

        // Get all rows
        List<WebElement> rows = datatable.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            String rowText = row.getText();

            // Check if this row contains "Bank of Baroda"
            if (rowText.contains("Bank of Baroda")) {
                System.out.println("Found the row:");
                System.out.println(rowText);
                break; // Stop loop after finding the row
            }
        }

        driver.quit();
    }
}
