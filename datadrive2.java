package auto;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadrive2 {
	public static void main(String[] args) throws BiffException, IOException {
		
		
		
		FileInputStream f=new FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\desktop\\book.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet  s = wb.getSheet("Sheet1");
		
		int totalrow = s.getRows();
		
		
		
		for(int i=0;i<totalrow;i++) {
			
			
			
			System.out.print(s.getCell(i, 0).getContents()+" ");
			
			
			
		}
		
		
	
			
	}
	
}
	
