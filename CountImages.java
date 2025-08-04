package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountImages {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver and open the webpage



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.flipkart.com/camera-accessories/camera-lenses/pr?sid=jek,6l2,e9y&q=camera+accessories&otracker=categorytree");

        // Step 2: Locate all <img> elements on the webpage
        List<WebElement> images = driver.findElements(By.tagName("img"));

        // Step 3: Print the total number of images
        System.out.println("Number of images on the webpage: " + images.size());

        // Step 4: Close the WebDriver
        driver.quit();
    }
}