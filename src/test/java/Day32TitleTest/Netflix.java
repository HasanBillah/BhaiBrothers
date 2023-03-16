package Day32TitleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Netflix {

	public class AnotherTest {

		WebDriver driver;
		
        @BeforeClass
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "/Users/hasanb./downloads/chromedriver");

			driver = new ChromeDriver();

		}

		@Test

		public void NetflixTest() {
			driver.get("https://www.netflix.com");
			String expTitle = "Netflix";

			String actTitle = driver.getTitle();

			Assert.assertEquals( actTitle,expTitle);

		}
	}

}
