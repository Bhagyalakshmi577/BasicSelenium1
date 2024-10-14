package AdvancedScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingRobotClass {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Robot rot=new Robot();
		rot.keyPress(KeyEvent.VK_PAGE_DOWN);
		rot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		rot.keyPress(KeyEvent.VK_PAGE_DOWN);
		rot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		rot.keyPress(KeyEvent.VK_PAGE_DOWN);
		rot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		rot.keyPress(KeyEvent.VK_PAGE_UP);
		rot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(1000);
		rot.keyPress(KeyEvent.VK_PAGE_UP);
		rot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
