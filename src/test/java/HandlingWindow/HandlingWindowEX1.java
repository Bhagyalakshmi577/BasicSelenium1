package HandlingWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWindowEX1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("blutooth",Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class=\"DByuf4\"])[1]")).click();
		
		String maiwindow = driver.getWindowHandle();
		System.out.println(maiwindow);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String ids : allwindows) 
		{
			if(!maiwindow.equals(ids))
			{
				driver.switchTo().window(ids);
			}
			
		}	
		String pricevalue = driver.findElement(By.xpath("//div[@class=\"Nx9bqj CxhGGd\"]")).getText();
		System.out.println(pricevalue);

	}

}
