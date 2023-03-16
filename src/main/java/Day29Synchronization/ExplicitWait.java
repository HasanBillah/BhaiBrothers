package Day29Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);   // ImplicitWait - if we use this, we don't need thread.sleep();
		

		WebElement e = driver.findElement(By.xpath("//*[text()='Create new account']"));

		e.click();
		
		//Thread.sleep(3000);
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);  // WebDriverWait(Explicit Wait)
		By locator = (By.xpath("//input[@name='firstname']"));  // copied from By.xpath from WebElement fname
		wait.until(ExpectedConditions.presenceOfElementLocated(locator)); // condition
		
		Actions act = new Actions(driver);
		
		WebElement fname = driver.findElement(locator);  // (locator) - only in WebDriverWait(ExplicitWait)
		act.sendKeys(fname,"Joe");
		act.perform();
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		act.sendKeys(lname,"Biden");
		act.perform();
		
		
		
		
		

	}

}
