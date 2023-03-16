package Day26Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndAttributeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List <WebElement> all = driver.findElements(By.xpath("//select"));
		int i = all.size();        //number of links
		System.out.println(i); 
		
		
		for(WebElement w : all) {
			String s = w.getAttribute("id");   // Attribute Value
			System.out.println(s);
		}

	}

}
