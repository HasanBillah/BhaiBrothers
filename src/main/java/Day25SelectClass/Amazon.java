package Day25SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
public static void main(String[] args) {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
		
	WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
	txtBox.sendKeys("shoes");
	
	WebElement btnSearch= driver.findElement(By.xpath("//input[@type='submit']"));
	btnSearch.click();
	
	WebElement txtValid= driver.findElement(By.xpath("(//span[contains(text(),'shoes')])[1]"));
		
	System.out.println(txtValid);
}

}
