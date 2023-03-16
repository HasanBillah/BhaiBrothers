package Day26Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List <WebElement> all = driver.findElements(By.xpath("//input"));
		int i = all.size();        //number of links
		System.out.println(i); 
		
		
		for(WebElement w : all) {
			String s = w.getAttribute("id");   // Attribute Value
			System.out.println(s);
		}
		
		
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		
		File src = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("data/ScreenShot01.png");
		FileUtils.copyFile(src,dest);
		

	}

}
