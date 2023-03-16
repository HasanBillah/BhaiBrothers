package Day26Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyTexts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//h2"));
//		Actions act = new Actions(driver);
//		act.doubleClick(txt).perform();
//		//act.contextClick(txt).perform();
////		act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).perform();
//		
//		
//		//act.sendKeys(txt,Keys.CONTROL+"c").perform();
		
		//690,509
		Point point = txt.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		System.out.println(xcord);
		System.out.println(ycord);
		
		Actions act = new Actions(driver);
	    act.moveToElement(txt).clickAndHold().moveByOffset(300, ycord).release();
	    
	    act.perform();

	}

}
