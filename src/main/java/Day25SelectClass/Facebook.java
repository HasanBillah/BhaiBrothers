package Day25SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg");
		
		WebElement e = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		Select month = new Select(e);
		
		//month.selectByVisibleText("Nov");//****************
		
		//month.selectByValue("11");
		
		//month.selectByIndex(10);
		
		List<WebElement> all = month.getOptions();
		
		for(WebElement i : all) {
			
			String s = i.getText();
			
			System.out.println(s);
				}
		

	}

}
