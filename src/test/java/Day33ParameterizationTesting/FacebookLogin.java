package Day33ParameterizationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	
	
	
	@Test (dataProvider = "dp1")
	
	public void logintest(String username, String password) {
		
		
		
		WebElement u1 = driver.findElement(By.xpath("//input[@name='email']"));
		u1.clear();
		u1.sendKeys(username);
		
		WebElement p1 = driver.findElement(By.xpath("//input[@name='pass']"));
		p1.clear();
		p1.sendKeys(password);
	
	}
	
	
	
	
	
	
	@DataProvider   (name = "dp1")
	public Object[][] getdata(){
		Object[][] r = {  {"sample1@gmail.com","abra"}, {"sample2@gmail.com","dabra"} };
		
		return r;
	}
	
	
	
	
	
	
}
