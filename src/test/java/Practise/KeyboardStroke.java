package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeyboardStroke {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("email")).sendKeys("lakshmiananda99@gmail.com",Keys.TAB,"Bhagya@1998",Keys.ENTER);
		driver.findElement(By.id("email")).sendKeys("lakshmiananda99@gmail.com");

		Robot rot=new Robot();
		rot.keyPress(KeyEvent.VK_TAB);
		rot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		//password.click();
		password.sendKeys("Bhagya@1998");
		rot.keyPress(KeyEvent.VK_ENTER);
		rot.keyRelease(KeyEvent.VK_ENTER);
		rot.keyPress(KeyEvent.VK_ENTER);
		rot.keyRelease(KeyEvent.VK_ENTER);


	}

}
