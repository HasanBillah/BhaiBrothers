package Day26Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		  driver.manage().deleteAllCookies();
		    driver.get("chrome://settings/clearBrowserData");
		    Thread.sleep(3000);
		    //driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		    
		    JavascriptExecutor je= (JavascriptExecutor)driver;
		    
		   WebElement btn = (WebElement) je.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(9) > settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"#clearBrowsingDataConfirm\");");
		    
		    btn.click()	;
		    
//		    driver.manage().deleteCookie(arg0); // Deletes the specific cookie
//		    driver.manage().deleteCookieNamed(arg0); // Deletes the specific cookie according to the Name
//		    driver.manage().deleteAllCookies(); // Deletes all the cookies

	}

}
