package Day34ValueFromExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReaderHelper {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/reg/");

	}
	
	
	
	@Test (dataProvider = "dp")
	
	public void fbtest(String f, String l) {
		
		
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.clear();
		fname.sendKeys(f);
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.clear();
		lname.sendKeys(l);
	}
	
	
	
	@DataProvider (name = "dp")
	public Object[][] getData() throws IOException{
	Object[][]t;
	String filename = "data/ExcelReadTesting.xlsx";
	String sheetname = "Sheet1";
	
	ExcelReader er = new ExcelReader(filename,sheetname);
	t = er.ExcelToArray();
	
	return t;

}
	}
