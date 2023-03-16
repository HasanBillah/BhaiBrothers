package Day29Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		
		
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
		
		WebElement we = driver.findElement(By.xpath("//button[text()='Start']"));
		we.click();
		
		
		WebElement hello = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String s = hello.getText();
		System.out.println(s);

	}

}
