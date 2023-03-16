package Day26Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPicturesWithoutSendKeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/hasanb./Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpg2png.com/");
		driver.manage().window().maximize();
		
		
		WebElement uploadbtn = driver.findElement(By.xpath("//label[@for='fileSelector']"));
		uploadbtn.click();
		
		StringSelection ss = new StringSelection("/Users/hasanb./Downloads/IMG_000.jpg");
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(ss, null);
		
		Robot robot = new Robot();

				// Cmd + Tab is needed since it launches a Java app and the browser looses focus

				robot.keyPress(KeyEvent.VK_META);
				robot.delay(200);


				robot.keyPress(KeyEvent.VK_F);

				robot.keyRelease(KeyEvent.VK_META);

				robot.keyRelease(KeyEvent.VK_F);

				robot.delay(500);

				//Open Goto window

//				robot.keyPress(KeyEvent.VK_META);
//
//				robot.keyPress(KeyEvent.VK_SHIFT);
//
//				robot.keyPress(KeyEvent.VK_G);
//
//				robot.keyRelease(KeyEvent.VK_META);
//
//				robot.keyRelease(KeyEvent.VK_SHIFT);
//
//				robot.keyRelease(KeyEvent.VK_G);
//
//				//Paste the clipboard value
//
//				robot.keyPress(KeyEvent.VK_META);
//
//				robot.keyPress(KeyEvent.VK_V);
//
//				robot.keyRelease(KeyEvent.VK_META);
//
//				robot.keyRelease(KeyEvent.VK_V);
//
//				//Press Enter key to close the Goto window and Upload window
//
//				robot.keyPress(KeyEvent.VK_ENTER);
//
//				robot.keyRelease(KeyEvent.VK_ENTER);
//
//				robot.delay(500);
//
//				robot.keyPress(KeyEvent.VK_ENTER);
//
//				robot.keyRelease(KeyEvent.VK_ENTER);
//
//		
				

	}

}
