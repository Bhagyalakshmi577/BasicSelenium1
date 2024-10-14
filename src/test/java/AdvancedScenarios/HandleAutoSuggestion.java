package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws Throwable 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//        driver.manage().window().maximize();
//	
//        driver.findElement(By.name("q")).sendKeys("bluetooth");
//        Thread.sleep(2000);    
//        List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
//        Thread.sleep(1000);
//        for (WebElement ele : allSugg) 
//        {
//        	System.out.println(ele.getText());
//        	if(ele.getText().contains("bluetooth speaker boat"))
//        	{
//        		ele.click();
//        	}
		
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("nike");
		  Thread.sleep(3000);
		  List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
          Thread.sleep(3000);
		  for (WebElement webElement : list) 
          {
			  Thread.sleep(3000);
        	  System.out.println(webElement.getText());
        	  if(webElement.getText().contains("nike shoes"))
        	  {
        		  webElement.click();
        	  }
			
		}
	}
	
	
	}


