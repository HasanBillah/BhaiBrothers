package Day34ValueFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InstagramTest {
	
	Sheet sh;
	
	public InstagramTest(String filename, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);	
	}
	
	
	public Object[][]fromExceltoArray(){
		Object[][]m;
		int totalrows = sh.getPhysicalNumberOfRows();
		int totalcells = sh.getRow(0).getPhysicalNumberOfCells();
		m=new Object[totalrows-1][totalcells];
		
		
		for(int row=1; row<totalrows; row++) {
			for(int cell=0; cell<totalcells; cell++) {
				Cell c = sh.getRow(row).getCell(cell);
				String s = "";
				
				
				if(c.getCellType()==Cell.CELL_TYPE_STRING) {
					s=""+c.getStringCellValue();
				}
				
				else {
					if(c.getNumericCellValue()%1==0) {
						s=""+(int)c.getNumericCellValue();
					}
					else {
						s=""+c.getNumericCellValue();
					}
				}
				
				m[row-1][cell]=s;
			}
		}
		return m;
	}
	

}
