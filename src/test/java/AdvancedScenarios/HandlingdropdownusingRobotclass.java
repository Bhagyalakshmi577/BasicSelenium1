package AdvancedScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingdropdownusingRobotclass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		day.click();
		Robot rot=new Robot();
		rot.keyPress(KeyEvent.VK_UP);
		rot.keyRelease(KeyEvent.VK_UP);
		rot.keyPress(KeyEvent.VK_UP);
		rot.keyRelease(KeyEvent.VK_UP);
		rot.keyPress(KeyEvent.VK_UP);
		rot.keyRelease(KeyEvent.VK_UP);
		rot.keyPress(KeyEvent.VK_UP);
		rot.keyRelease(KeyEvent.VK_UP);
		
      
		WebElement month = driver.findElement(By.name("birthday_month"));
		month.click();
		rot.keyPress(KeyEvent.VK_DOWN);
		rot.keyRelease(KeyEvent.VK_DOWN);
		rot.keyPress(KeyEvent.VK_DOWN);
		rot.keyRelease(KeyEvent.VK_DOWN);
		rot.keyPress(KeyEvent.VK_DOWN);
		rot.keyRelease(KeyEvent.VK_DOWN);
		
	    WebElement year = driver.findElement(By.name("birthday_year"));
	    year.click();
		rot.keyPress(KeyEvent.VK_UP);
		rot.keyRelease(KeyEvent.VK_UP);
		rot.keyPress(KeyEvent.VK_UP);
		rot.keyRelease(KeyEvent.VK_UP);
		rot.keyPress(KeyEvent.VK_UP);
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 30);
	}

}
