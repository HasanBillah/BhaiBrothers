package Day34ValueFromExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookRegistrationTestCase {
	@Test(dataProvider="data")
	public void RunFacebook(String f,String l) {
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.clear();
		firstname.sendKeys(f);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.clear();
		lastname.sendKeys(l);
	}
	
	@DataProvider(name="data")
	public Object[][] getdatafrom() throws IOException{
		Object[][] p;
		String files = "data/ExcelReadTesting.xlsx";
		String sheets = "Sheet1";
		
		FacebookRegistration fr = new FacebookRegistration(files,sheets);
		p=fr.fromExceltoArray();
		
		return p;
	}
	
	
	

}
