package Day30MultipleWindows;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwoWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");

	

		WebElement e = driver.findElement(By.xpath("//a[text()='Things to do']"));
		e.click();

		
		
		
		String current = driver.getWindowHandle();

		Set<String> all = driver.getWindowHandles();
		for (String second : all) {
			if (!second.equals(current)) {
				driver.switchTo().window(second);
			}
		}

		Actions act = new Actions(driver);
 

		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		act.sendKeys(search, "New York");
		act.perform();

	}

}
