package Day26Actions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// Default size
		Dimension currentDimension = driver.manage().window().getSize();
		int height = currentDimension.getHeight();
		int width = currentDimension.getWidth();
		System.out.println("Default height: "+ height);
		System.out.println("Default width: "+width);
		
		// Set new size
		Dimension newDimension = new Dimension(800, 600);
		driver.manage().window().setSize(newDimension);
		
		// Getting 
		Dimension newSetDimension = driver.manage().window().getSize();
		int newHeight = newSetDimension.getHeight();
		int newWidth = newSetDimension.getWidth();
		System.out.println("Current height: "+ newHeight);
		System.out.println("Current width: "+newWidth);

	}

}
