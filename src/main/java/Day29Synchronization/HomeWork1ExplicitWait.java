package Day29Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork1ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		
		
		WebElement we = driver.findElement(By.xpath("//a[text()='25']"));
		we.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		By locator = By.xpath("//span[@class='label']");
		wait.until(ExpectedConditions.textToBePresentInElement(locator, "Monday, July 25, 2022"));
		
		
		WebElement SelectedDate = driver.findElement(locator);
		String s = SelectedDate.getText();
		System.out.println(s);

	}

}
