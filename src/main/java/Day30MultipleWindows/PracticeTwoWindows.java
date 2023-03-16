package Day30MultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTwoWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");
	
		
		WebElement c = driver.findElement(By.xpath("//a[text()='Things to do']"));
		c.click();
		
		
		
		String firstwindow = driver.getWindowHandle();
		
		Set <String> all = driver.getWindowHandles();
		for(String secondwindow : all) {
			if(!secondwindow.equals(firstwindow)) {
				driver.switchTo().window(secondwindow);	
			}
		}
		
		WebElement c1 = driver.findElement(By.xpath("//input[@type='search']"));
		c1.click();

	}

}
