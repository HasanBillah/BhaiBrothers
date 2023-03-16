package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeYoutube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
	    Thread.sleep(5000);
		WebElement WE = driver.findElement(By.xpath("//*[text()='Sign in']"));
		WE.click();
		

	}

}
