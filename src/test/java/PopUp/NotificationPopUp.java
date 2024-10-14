package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUp {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-searc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_TAB);//----->close
		rob.keyRelease(KeyEvent.VK_TAB);

		rob.keyPress(KeyEvent.VK_TAB);//----->Allow
		rob.keyRelease(KeyEvent.VK_TAB);

		rob.keyPress(KeyEvent.VK_TAB);//----->BLock
		rob.keyRelease(KeyEvent.VK_TAB);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);


	}

}
