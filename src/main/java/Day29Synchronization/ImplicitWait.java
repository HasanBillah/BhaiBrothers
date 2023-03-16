package Day29Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);   // ImplicitWait - if we use this, we don't need thread.sleep();
		

		WebElement e = driver.findElement(By.xpath("//*[text()='Create new account']"));

		e.click();
		
		
		
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Biden");
		

	}

}
