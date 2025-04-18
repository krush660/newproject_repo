package auto;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class alldatavalue_exel6 {
	
	
	public static void main(String[] args) throws BiffException, IOException {
		
		
		FileInputStream f=new FileInputStream("C:\\Users\\hp\\OneDrive\\Documents\\desktop\\book3.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet  s = wb.getSheet("Sheet1");
		
		int totalrow = s.getRows();
		int totalcol = s.getColumns();

		
		
		for(int i=0;i<totalrow;i++) {
			
			for(int j=0;j<totalcol;j++) {
				
				System.out.print(s.getCell(j, i).getContents()+ " ");

		
				
			}
			
			System.out.println();
			
			
		}
		
	}

	}
