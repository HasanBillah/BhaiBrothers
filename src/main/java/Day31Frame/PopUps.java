package Day31Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/hasanb./Downloads/alert.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement c = driver.findElement(By.xpath("(//button)[2]"));
		c.click();
		
		WebElement d = driver.findElement(By.xpath("//button[@title='Close']"));
		d.click();

	}

}
