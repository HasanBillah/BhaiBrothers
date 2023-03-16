package Day31Frame;

import java.awt.Button;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/tinymce");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.switchTo().frame(0);
		
		
		
		WebElement c = driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
		c.clear();
		c.sendKeys("We are facing an exam.");
		
		driver.switchTo().defaultContent();
		
		
		WebElement c1 = driver.findElement(By.xpath("//button[@title='Formats']"));
		c1.click();
		
		
		WebElement c2 = driver.findElement(By.xpath("//div[@title='Headings']"));
		c2.click();
		
		
		WebElement c3 = driver.findElement(By.xpath("//h1[text()='Heading 1']"));
		c3.click();
		
		
		WebElement c4 = driver.findElement(By.xpath("(//span[@class='tox-icon tox-tbtn__icon-wrap'])[7]"));
		c4.click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("data/HomeWorkScreenShot.png");
		FileUtils.copyFile(src, dest);
		

		
		WebElement c1again = driver.findElement(By.xpath("//button[@title='Formats']"));
		c1again.click();
		
		
		WebElement c2again = driver.findElement(By.xpath("//div[@title='Headings']"));
		c2again.click();
		
		
		
		
		List<WebElement> all = driver.findElements(By.xpath("(//div[@class='tox-collection__group'])[2]"));
		
		for(WebElement w : all) {
			String s = w.getText();
			System.out.println(s);
		}
			

	}

}
