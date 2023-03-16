package Day25SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement e = driver.findElement(By.xpath("//*[@id=\"email\"]"));

		e.sendKeys("sample.sample");

		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"pass\"]"));

		e1.sendKeys("abracadabra");
	}

}
