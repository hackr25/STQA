import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.*;
import jxl.read.*;
import jxl.write.*;
import java.io.*;

public class cstud {
	@BeforeClass
	
	public void f1() {}
	
	@Test
	
	public void textImportexport1() throws Exception{
		FileInputStream f1 = new FileInputStream("D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\records.xls");
		Workbook w = Workbook.getWorkbook(f1);
		
		Sheet s = w.getSheet(0);
		
		String a[][] = new String[s.getRows()][s.getColumns()];
		
		FileOutputStream fo = new FileOutputStream("D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\results.xls");
		WritableWorkbook wwb = Workbook.createWorkbook(fo);
		WritableSheet ws = wwb.createSheet("result1", 0);
		for (int i = 0; i<s.getRows(); i++){
			for (int j = 0; j<s.getColumns(); j++){
				a[i][j] =s.getCell(j,i).getContents();
				Label l2 = new Label(j,i,a[i][j]);
				ws.addCell(l2);
				
				Label l1 = new Label(6,0,"Result");
				ws.addCell(l1);
				
			}
			
		}
		for(int i = 1; i<s.getRows(); i++){
			for(int j = 2; j<s.getColumns(); j++){
				a[i][j] = s.getCell(j,i).getContents();
				int x = Integer.parseInt(a[i][j]);
				if(x>35){
					Label l1 = new Label(6,i,"Pass");
					ws.addCell(l1);
				}
				else{
					Label l1 = new Label(6,i,"Fail");
					ws.addCell(l1);
					break;
				}
			}
		}
	}

}
