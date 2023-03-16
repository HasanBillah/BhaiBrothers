package Day34ValueFromExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class InstaTestCase {
	
	@Test (dataProvider = "dp")
	public void InstagramTest(String email,String fullname,String username) {
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		
		WebElement e = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		e.clear();
		e.sendKeys(email);
		
		WebElement f = driver.findElement(By.xpath("//input[@name='fullName']"));//
		f.clear();
		f.sendKeys(fullname);
		
		WebElement u = driver.findElement(By.xpath("//input[@name='username']"));
		u.clear();
		u.sendKeys(username);
	}
	
	@DataProvider (name = "dp")
	public Object[][] getdata() throws IOException{
		Object[][]r;
		String filename = "data/Book1.xlsx";
		String sheetname = "Sheet1";
		
		InstaTest er = new InstaTest(filename,sheetname);
		r=er.exceltoarray();
		return r;
	}

}
