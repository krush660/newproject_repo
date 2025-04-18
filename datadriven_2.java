package auto;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriven_2 {
	
	public static void main(String[] args) throws BiffException, IOException {
		
		//WebDriver driver = null;
		
		FileInputStream f=new FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\desktop\\book3.xls");
		
		Workbook wb= Workbook.getWorkbook(f);
		
		Sheet  s = wb.getSheet("Sheet1");

		System.out.println(s.getCell(0,0).getContents());
		
		for(int i=0;i<2;i++) {
			
			System.out.println(s.getCell(0, i).getContents());
			//driver.close();
			
			
			
		}
		
		
		

		
	}
		
		
		
		
		
	}


