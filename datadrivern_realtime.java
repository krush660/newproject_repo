package auto;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadrivern_realtime {
	
public static void main(String[] args) throws BiffException, IOException, InterruptedException {
	
	
	FileInputStream f=new FileInputStream("C:\\\\Users\\\\hp\\\\OneDrive\\\\Documents\\\\desktop\\\\krushnal.xls");
	
	Workbook wb = Workbook.getWorkbook(f);
	
	Sheet  s = wb.getSheet("Sheet1");
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

    WebDriver	driver=new ChromeDriver();
	driver.get(s.getCell(0,2).getContents());
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	

driver.findElement(By.id(s.getCell(0, 3).getContents())).sendKeys(s.getCell(0, 4).getContents());

Thread.sleep(3000);

driver.findElement(By.id(s.getCell(0, 5).getContents())).sendKeys(s.getCell(0, 6).getContents());

Thread.sleep(3000);

}
	
}

