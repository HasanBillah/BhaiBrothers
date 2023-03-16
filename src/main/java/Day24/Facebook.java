package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/hasanb./Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com");
		
		
		WebElement e = driver.findElement(By.xpath("//*[text()='Create new account']"));
		
		e.click();

	}

}
