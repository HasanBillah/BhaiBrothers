package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/hasanb./Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();   //to maximize window
		
		WebElement WE = driver.findElement(By.xpath("//*[text()='Create new account']"));
		
		WE.click();
		
		Thread.sleep(5000);
		
		WebElement w = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		w.click();
		
		if(w.isSelected()) {                    // to check if radio/checkbox  selected or not
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");

		}
		
		String s = driver.getCurrentUrl();     // to get current Url
		System.out.println(s);
		
		driver.navigate().back();    // to go back to previous webpage  (  <--  )
		driver.navigate().forward(); // to go forward to previous webpage  (  -->  )
		driver.navigate().refresh(); // This method refreshes the current page
		
		//driver.navigate().to(http://yahoo.com);          -- instead of driver.get()
	

	}

}
