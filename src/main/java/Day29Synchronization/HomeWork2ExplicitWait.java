package Day29Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork2ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");	
		
		
		WebElement we = driver.findElement(By.xpath("//button[text()='Start']"));
		we.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,8);
		By locator = By.xpath("//h4[text()='Hello World!']");
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		WebElement SelectedDate = driver.findElement(locator);
		String s = SelectedDate.getText();
		System.out.println(s);

	}

}
