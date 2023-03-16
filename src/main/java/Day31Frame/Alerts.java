package Day31Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/hasanb./Downloads/alert.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement c =driver.findElement(By.xpath("//button[text()='Click me for a basic JavaScript alert']"));
		c.click();
		
		
		Alert alt = driver.switchTo().alert();  
		
		String s = alt.getText();    // no xPath for Alert
		System.out.println(s);
		
		alt.accept(); // accepts okay or yes button
//		alt.dismiss(); // accepts cancel or no button
		
		
		
		
//		String mainPage = driver.getWindowHandle();
//		 
//		 Alert alt = driver.switchTo().alert();          // to move control to alert popup
//		 
//		 alt.accept(); // to click on ok.
//		 
//		 alt.dismiss(); // to click on cancel.
//		 
//		 //Then move the control back to main web page-
//		 
//		 driver.switchTo().window(mainPage);          → to switch back to main page.

		
		
		
		
		

	}

}
