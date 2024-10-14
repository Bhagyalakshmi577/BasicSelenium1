package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandlingSVGElements {

	//public static void main(String[] args) 
	@Test
	public void HandlingSVGElements()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		/*with normal xpath we can't get the 1 on of 1 for svg tag element so we have to use the below syntax to get the 1 of 1
		syntax:
		//*
		//*[name()='svg' and @AttributeName='AttributeValue']
		*/
		driver.findElement(By.xpath("//*[name()='svg' and @class='A_8a-icon']")).click();
		
			

	}

}
