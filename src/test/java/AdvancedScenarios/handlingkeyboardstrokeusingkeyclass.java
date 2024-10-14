package AdvancedScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingkeyboardstrokeusingkeyclass {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input[@class='form_input'])[1]")).sendKeys("standard_user",Keys.TAB);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce",Keys.ENTER);
		//driver.findElement(By.xpath("(//input[@class='form_input'])[1]")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);

		WebElement username = driver.findElement(By.xpath("(//input[@class='form_input'])[1]"));
		username.sendKeys("standard_user",Keys.CONTROL +"a");
		//username.sendKeys(Keys.CONTROL,"a");
		//username.sendKeys(Keys.CONTROL,"x");
		username.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		//WebElement password = driver.findElement(By.name("password"));
		//username.sendKeys(Keys.CONTROL.TAB,Keys.CONTROL+"v");
		

		//WebElement UserText = driver.findElement(By.name("user-name"));
		//UserText.sendKeys("standard_user",Keys.CONTROL +"a");
		//UserText.sendKeys(Keys.CONTROL+"c");
		//UserText.sendKeys(Keys.TAB,Keys.CONTROL+"v");


		/*driver.get("https://www.amazon.in/"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma"); 
		 Robot rob=new Robot(); 
		 rob.keyPress(KeyEvent.VK_ENTER);
		 rob.keyRelease(KeyEvent.VK_ENTER);*/



	}

}
