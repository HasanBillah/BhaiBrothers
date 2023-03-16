package Day32TitleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTitleTest {
	
	
	
	WebDriver driver;
	
	@Test (priority = 2)
	public void FbTest() {
	
     
		driver.get("http://www.facebook.com");
		
		String expectedTitle = "Facebook";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
	}
	
	@Test (priority =1, enabled =true)  // enabled=false means disabled 
	public void GoogleTitleTest() {
		
			driver.get("https://www.google.com/");
			
			String expectedTitle = "Google";
			
			String actualTitle = driver.getTitle();
			
			Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.gecko.driver","/Users/hasanb./Downloads/geckodriver");
			 driver = new FirefoxDriver();
		
	}

}
