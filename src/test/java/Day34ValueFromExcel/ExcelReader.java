package Day34ValueFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReader {


	Sheet sh;

	public ExcelReader(String filename, String sheetname) throws IOException {

		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);

		sh = wb.getSheet(sheetname);

	}

	public Object[][] ExcelToArray() {
		Object[][] t;
		int TotalRows = sh.getPhysicalNumberOfRows();
		int TotalColumns = sh.getRow(0).getPhysicalNumberOfCells();

		t = new Object[TotalRows - 1][TotalColumns];

		for (int r = 1; r < TotalRows; r = r + 1) {

			for (int col = 0; col < TotalColumns; col = col + 1) {

				Cell c = sh.getRow(r).getCell(col);
				String value = "";
				
				if (c.getCellType() == Cell.CELL_TYPE_STRING) {
					value = c.getStringCellValue();
				}

				else {

					if (c.getNumericCellValue() % 1 == 0) {
						value = "" + (int) c.getNumericCellValue();

					}

					else {
						value = "" + c.getNumericCellValue();

					}
				}
				
				t[r - 1][col] = value;
				

			}

		}
		
		return t;
		
		

	}
	

	
}
