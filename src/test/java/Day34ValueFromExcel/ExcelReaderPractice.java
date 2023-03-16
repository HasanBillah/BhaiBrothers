package Day34ValueFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderPractice {
	
	Sheet sh;
	
	public ExcelReaderPractice(String filename, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
	}
	
	
	public Object[][] exceltoarray(){
		Object[][] t;
		int totalrows = sh.getPhysicalNumberOfRows();
		int totalcolumns = sh.getRow(0).getPhysicalNumberOfCells();
		t = new Object[totalrows-1][totalcolumns];
		
		
		for(int row=1; row<totalrows; row++) {
			for(int column=0; column<totalcolumns; column++) {
				Cell c = sh.getRow(row).getCell(column);
				String value = "";
				
				
				if(c.getCellType()==Cell.CELL_TYPE_STRING) {
					value = c.getStringCellValue();					
				}
				
				else {
					 if(c.getNumericCellValue()%1==0) {
						 value=""+(int)c.getNumericCellValue();
					 }
					 else {
						 value=""+c.getNumericCellValue();
					 }
				}
				
				t[row-1][column]=value;
			}
		}
		return t;
	}


}

