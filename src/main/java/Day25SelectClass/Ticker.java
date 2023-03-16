package Day25SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Ticker {
	
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");

	WebDriver driver = new ChromeDriver();

	driver.get("https://finviz.com/");
	
	
	List<WebElement> all = driver.findElements(By.xpath("//a[contains(@href,'quote.ashx?t=')]"));
	
	
	for(WebElement i : all) {
		
		String tickers = i.getText();
		
		System.out.println(tickers);
			}	

}
}