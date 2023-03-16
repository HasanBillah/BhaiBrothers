package Day29Synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork1ImplicitWaitAcceptCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		WebElement e = driver.findElement(By.xpath("//button[text()='Accept Cookies']"));
		e.click();
		
		
		WebElement we = driver.findElement(By.xpath("(//a[@href='#'])[31]"));
		we.click();
		
		
		
		
		
		WebElement SelectedDate = driver.findElement(By.xpath("//span[@class='label']"));
		String s = SelectedDate.getText();
		System.out.println(s);
		
		
		
		
			
		}
		
		

	}


