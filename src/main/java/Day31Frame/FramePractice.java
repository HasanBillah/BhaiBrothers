package Day31Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/hasanb./Downloads/iframeexercise/FrameExample.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.xpath("//input[@name='tb']"));
		a.sendKeys("New York");
		
		driver.switchTo().defaultContent();   /// tricky part- memorise it
		
		
		
		
		
        driver.switchTo().frame(1);
		
		WebElement b = driver.findElement(By.xpath("//input[@name='tb']"));
		b.sendKeys("California");

	}

}
