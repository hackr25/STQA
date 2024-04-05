import jxl.*;
import jxl.write.*;
import jxl.read.*;

import java.io.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class ustud {
	
	@BeforeClass
	public void f1() {}
	
	@Test
	public void testImportexport1() throws Exception{
		FileInputStream f1 = new FileInputStream("D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\records.xls");
		
		Workbook w = Workbook.getWorkbook(f1);
		
		Sheet s = w.getSheet(0);
		
		String a[][] = new String[s.getRows()][s.getColumns()];
		
		FileOutputStream fo = new FileOutputStream("D:\\prac\\wetransfer_st-rar_2024-03-21_0231\\ST\\ST\\results2.xls");
		
		WritableWorkbook wwb = Workbook.createWorkbook(fo);
		
		WritableSheet ws = wwb.createSheet("result", 0);
		
		int c = 0;
		
		for(int i = 0; i<s.getRows(); i++){
			for(int j = 0; j<s.getColumns(); j++){
				if(i>=1){
					String b = new String();
					b = s.getCell(3,i).getContents();
					int x = Integer.parseInt(b);
					if(x<60){
						c++;
					}
				}
				a[i][j] = s.getCell(i,j).getContents();
				
				Label l2 = new Label(j,i-c,a[i][j]);
				
				ws.addCell(l2);
			}
		}
		wwb.write();
		wwb.close();
	}
	

}
