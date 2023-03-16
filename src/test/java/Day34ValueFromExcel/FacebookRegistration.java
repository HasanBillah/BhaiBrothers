package Day34ValueFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FacebookRegistration {

	Sheet sh;
	
	public FacebookRegistration(String filesnames,String sheetsnames) throws IOException {
		FileInputStream fis = new FileInputStream(filesnames);
		Workbook wb = new XSSFWorkbook(fis);
		sh=wb.getSheet(sheetsnames);
		
		wb.close();
		fis.close();
	}
		
		public Object[][]fromExceltoArray(){
			Object[][] m;
			int TotalRows = sh.getPhysicalNumberOfRows();
			int TotalCells = sh.getRow(0).getPhysicalNumberOfCells();
			m= new Object[TotalRows-1][TotalCells];
			
			for(int row=1; row<TotalRows; row++) {
				for(int cell=0; cell<TotalCells; cell++) {
					Cell c = sh.getRow(row).getCell(cell);
					String s = "";
					
					
					if(c.getCellType()==Cell.CELL_TYPE_STRING) {
						s=c.getStringCellValue();
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
