package auto;

import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class datadriven {
public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
	
	
	FileOutputStream file =new FileOutputStream("C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\kru.xls");
	
	WritableWorkbook wr=Workbook.createWorkbook(file);
	
	WritableSheet ws=wr.createSheet("sheet",1);
	
	Label lab=new Label(0,0 ,"automation");
	
	
	ws.addCell(lab);
	wr.write();
	wr.close();
	
	
}
}
