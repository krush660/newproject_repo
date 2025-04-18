package auto;

import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class dataprovider_outpt {
    
    public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
        
        FileOutputStream f = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\kru.xls");
        
        WritableWorkbook wb = Workbook.createWorkbook(f);
        
        WritableSheet ws = wb.createSheet("Sheet2", 1); // Changed the sheet index to 0
     
        int c = 23;
        
      //  Label lb = new Label(0, 0, "Value is " );
        
        Label lb =new Label(0, 0, "vaalur");
        
        ws.addCell(lb);
        
        // Writing and closing the workbook
        wb.write();
        
        System.out.println("data write sucessfully");
        wb.close();
    }
}

