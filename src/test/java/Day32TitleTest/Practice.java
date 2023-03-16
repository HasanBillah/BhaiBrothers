package Day32TitleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice {
	
	
	WebDriver driver;
	
	
	@BeforeClass     //for same window    //BeforeClass will execute first always
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}
	
	 
	//runs first by method name's alphabetically, that's why we need priority.
	
	@Test (priority = 2)
	public void FacebookTitle() {
		driver.get("https://www.facebook.com/");
		String ExpectedTitle = "Facebook";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle );
	}
	
	
	
	@Test  (priority=1, enabled = true)   //enable false means it will not be executed.
	public void GoogleTitle() {
		driver.get("https://www.google.com/");
		String ExpectedTitle = "Google";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle,ExpectedTitle );
	}
	


}
