package auto;

import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class datadriven23 {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException  {
		
		FileOutputStream file = new FileOutputStream("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\kru.xls");
		
		WritableWorkbook wb =Workbook.createWorkbook(file);
		
		WritableSheet ws=wb.createSheet("sheet",1);
		
Label lb=new Label(0, 0, "automation")	;

ws.addCell(lb);

wb.write();
wb.close();

		
	}


}
