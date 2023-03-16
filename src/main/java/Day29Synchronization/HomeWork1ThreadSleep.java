package Day29Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		
		
		
		
		
		WebElement we = driver.findElement(By.xpath("(//a[@href='#'])[31]"));
		we.click();
		
		
		
		Thread.sleep(3000);
		
		
		WebElement SelectedDate = driver.findElement(By.xpath("//span[@class='label']"));
		String s = SelectedDate.getText();
		System.out.println(s);
		

	}

}
