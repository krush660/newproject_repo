package auto;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriven_all {
	 public static void main(String[] args) throws BiffException, IOException {

	        FileInputStream f = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\krushnal.xls");

	        Workbook wb = Workbook.getWorkbook(f);
	        Sheet s = wb.getSheet("Sheet1");

	        int rows = s.getRows();       // total number of rows
	        int cols = s.getColumns();    // total number of columns

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                String cellData = s.getCell(j, i).getContents();  // j=col, i=row
	                System.out.print(cellData + "\t"); // \t for spacing
	            }
	            System.out.println(); // next line after each row
	        }
	    }
	}


