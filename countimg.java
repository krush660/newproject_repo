package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class countimg {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver and open the webpage

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Navigate to the Flipkart homepage
        driver.get("https://www.flipkart.com/");

        // Step 3: Close the login popup
       

        // Step 4: Locate the search bar, enter "iPhone," and click the search button
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.clear();
        searchBar.sendKeys("iPhone");

        WebElement searchButton = driver.findElement(By.cssSelector("button._2iLD__"));
        searchButton.click();

        // Step 5: Wait for the page to load
        try {
            Thread.sleep(5000); // Adjust based on loading time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Step 6: Locate all images on the webpage
        List<WebElement> images = driver.findElements(By.tagName("img"));

        // Step 7: Print the total number of images
        System.out.println("Number of images on the webpage: " + images.size());

        // Step 8: Close the WebDriver
        driver.quit();
    }
}