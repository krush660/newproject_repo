package auto;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class data_driven_framework {
	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\kru.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet  s = wb.getSheet("Sheet1");
		
		System.out.println(s.getCell(0,0).getContents());
		
		
		
		

		
	}
	
	
	

}
