package Day30MultipleWindows;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThreeTabsHomeWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");
		
		Thread.sleep(7000);
	
		
		WebElement c = driver.findElement(By.xpath("//a[text()='Things to do']"));
		c.click();
		
		
		
		
		
		String firsttab = driver.getWindowHandle();
		                               
		
		Set<String> twotabs = driver.getWindowHandles();
		for (String secondwindow : twotabs) {
			if (!secondwindow.equals(firsttab)) {
				
				driver.switchTo().window(secondwindow);
			}
		}
		

		Actions act = new Actions(driver);
 

		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		act.sendKeys(search, "New York");
		act.perform();
		
		
		
		
		
		
		driver.switchTo().window(firsttab);
		
		WebElement c1 = driver.findElement(By.xpath("//a[text()='Groups & Meetings']"));
		c1.click();
		
		
		
		
		
		Set<String> all = driver.getWindowHandles();
		for(String thirdtab : all) {
			String fasttab="";    //we have to convert secondtab to string to compare at next line
	
			if(!(thirdtab.equals(firsttab) && thirdtab.equals(fasttab))) {
				
				driver.switchTo().window(thirdtab);
				
			}
		}
		
		
		WebElement destination = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
		act.sendKeys(destination,"New York");
		act.perform();

	}
	
	//driver.close(); - specific tab/window
	//driver.quit(); - everything closed or whole browser

}
