package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActions {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement amazon = driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
		Actions act=new Actions(driver);
		//-------method1: Move to the element------
		 * 
		act.moveToElement(amazon).perform();
		//------------method2: rightclick element -contextclick()------------
		 
		act.contextClick(amazon).perform();*/
		
		/*driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.id("login-button"));*/
		
		Actions act=new Actions(driver);
		//-------method3,4,5 click(),build(),sendkeys()-----------
//		act.sendKeys(username,"standard_user").perform();
//		act.sendKeys(password,"secret_sauce").perform();
//		act.sendKeys(login).perform();
		//other option
//		act.sendKeys(username, "standard_user").sendKeys(password, "secret_sauce").sendKeys(login).click().build().perform();	
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		driver.manage().window().maximize();
//		WebElement drag = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
//		//-----method6,7,8 clickAndHold(),release(),dragAndDrop()-----------------
		//act.clickAndHold(drag).release(drop).build().perform();
		
		
		//other option
//		act.dragAndDrop(drag, drop).build().perform();
		
		//----method9-----------	
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(ele).perform();*/
		
		//method10:
		/*driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		act.moveByOffset(30, 40).click().perform();*/
	}

}
