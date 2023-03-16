package Day34ValueFromExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderPracticeHelper {


	@Test (dataProvider = "dp")
	public void fbregtest(String firstname, String lastname ) {
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.clear();
		fname.sendKeys(firstname);
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.clear();
		lname.sendKeys(lastname);
	}
	
	@DataProvider (name = "dp")
	public Object[][] getdata() throws IOException{
		Object[][]r;
		String filename = "data/ExcelReadTesting.xlsx";
		String sheetname = "Sheet1";
		
		ExcelReaderPractice er = new ExcelReaderPractice(filename,sheetname);
		r=er.exceltoarray();
		return r;
	}

}

//same class e korle keno run hoy na
//row -1 dileo ja ar sudhu row dileo eki kaj kore, tahole row-1 deyar ki dorkar
