package Day26Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		Actions act = new Actions(driver);

		WebElement user = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		act.sendKeys(user, "hasanbillah@outlook.com");
		act.perform();

		WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		act.sendKeys(pass, "abracadabra");
		act.perform();

		act.contextClick(pass); // right click
		act.perform();

		act.sendKeys(Keys.COMMAND + "A"); // to be more specific - (user,Keys.COMMAND + "A"); //(pass,Keys.COMMAND + "A");
											
		act.perform();
		
		
		

	}

}
