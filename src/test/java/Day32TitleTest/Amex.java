package Day32TitleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Amex {

	WebDriver driver;

	@BeforeSuite
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.americanexpress.com/");
	}

	@Test(priority = 1)
	public void titleTest() {
		String expectedTitle = "American Express Credit Cards, Rewards & Banking";

		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	@Test(priority = 2)
	public void AccountLogin() {
		WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Log In']"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		By locator = By.xpath("(//input[@type='text'])[2]");
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement UserID = driver.findElement(locator);
		UserID.sendKeys("Hasan.Billah");
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Hasan.Billah");
		
		WebElement SelectDD = driver.findElement(By.xpath("//select"));
		SelectDD.click();
		
		
		
		WebElement clickRemember = driver.findElement(By.xpath("//div[@class='checkbox eliloRemember']"));
		//clickRemember.click();
		String Actualtext = clickRemember.getText();
		String ExpectedText = "Remember Me";
		Assert.assertEquals(Actualtext, ExpectedText);
	
		
	}

}
