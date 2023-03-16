package Day34ValueFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InstaTest {
	
	Sheet sh;
	
	public InstaTest(String filename,String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh=wb.getSheet(sheetname);
	}
	
	
	public Object[][]exceltoarray(){
		Object[][] t;
		int totalrow = sh.getPhysicalNumberOfRows();
		int totalcolumn = sh.getRow(0).getPhysicalNumberOfCells();
		t=new Object[totalrow-1][totalcolumn];
		
		for(int row=1; row<totalrow; row++) {
			for(int column=0; column<totalcolumn; column++) {
				Cell c = sh.getRow(row).getCell(column);
				String value ="";
				
				if(c.getCellType()==Cell.CELL_TYPE_STRING){
					value = c.getStringCellValue();
				}
				
				else {
					if(c.getNumericCellValue()%1==0) {
						value = ""+(int)c.getNumericCellValue();
					}
					else {
						value = ""+c.getNumericCellValue();
					}
				}
				
				t[row-1][column]=value;
			}
		}
		
		return t;
	}

}
