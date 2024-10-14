package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleMultipleWebElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		
		int count = 0;
		for (WebElement webElement : list) 
		{
			//System.out.println(webElement.getText());
			System.out.println(webElement.getAttribute("href"));
			count++;
		}
		System.out.println("count value is:" +count);

	}

}
