package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdownusingkeyclass {

	public static void main(String[] args) throws Throwable 
	{
		//using  keyboard Strokes-----keys class and roboat class
		//using Select class 
		//using webelements
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		day.sendKeys(Keys.ARROW_UP);
		day.sendKeys(Keys.ARROW_UP);
		day.sendKeys(Keys.ARROW_UP);
		day.sendKeys(Keys.ARROW_UP);
      
		WebElement month = driver.findElement(By.name("birthday_month"));
		month.click();
		month.sendKeys(Keys.ARROW_UP);
		month.sendKeys(Keys.ARROW_UP);
		
		
	    WebElement year = driver.findElement(By.name("birthday_year"));
	    year.click();
	    year.sendKeys(Keys.ARROW_DOWN);
	    year.sendKeys(Keys.ARROW_DOWN);
	    year.sendKeys(Keys.ARROW_DOWN);
	    year.sendKeys(Keys.ARROW_DOWN);
	   
	    
	}

}
