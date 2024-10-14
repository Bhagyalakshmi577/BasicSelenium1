package AdvancedScenarios;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWait {
	
	
	/* //implicit wait
		//version3:---- only once should be used in code which in once class
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Version4  --- only once should be used in code which in once class
		 * 
		 * //Explicit wait
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(click));--method1
	//	wait.until(ExpectedConditions.titleContains("Hello"));--method2
//		click.click();
 * 
 *       	//fluent wait
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(click));
		click.click();
		 *   */

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		//implicit wait
		//version3:---- only once should be used in code which in once class
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Version4  --- only once should be used in code which in once class
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement click = driver.findElement(By.name("q"));
		click.sendKeys("bluetooth");
		//Thread.sleep(2000);
		
//		//Explicit wait
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(click));--method1
	//	wait.until(ExpectedConditions.titleContains("Hello"));--method2
//		click.click();
		
		//fluent wait
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(click));
		click.click();
		
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		//Thread.sleep(1000);
		for (WebElement ele : allSugg) 
		{
			System.out.println(ele.getText());
			if(ele.getText().contains("bluetooth speaker boat"))
			{
				ele.click();
			}

		}
	}
}
