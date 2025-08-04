package auto;

import java.util.List;

import javax.sql.RowSetEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handeling_webtable {
	
	
	public static void main(String[] args) throws InterruptedException {
        // Setting the system property for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

        System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

        // Create an instance of EdgeDriver
        WebDriver driver = new EdgeDriver();
        
        WebElement datatable = driver.findElement(By.className("dataTable"));
        
 List<WebElement> row = datatable.findElements(By.tagName("tr"));
 
 for(WebElement newrow :row) {
	 
	 System.out.println(newrow.getText());
 }

System.out.println(row.size());

List<WebElement> header = datatable.findElements(By.tagName("th"));

for(WebElement newheader :header) {
	
	System.out.print(newheader.getText());
}
System.out.println(header.size());

List<WebElement> datainsidetable = datatable.findElements(By.tagName("td"));

for(WebElement newdatainsidetable :datainsidetable) {
	
	System.out.print(newdatainsidetable.getText());
}

System.out.print(datainsidetable.size());


driver.close();







	
	
	
	}
}
