package HandlingWindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWindowEX3 {

	public static void main(String[] args) 
	{

		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		for (String ids : allids) 
		{
			driver.switchTo().window(ids);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
			
		}
		driver.findElement(By.xpath("//a[text()='Register now!']")).click();
		Set<String> thredwin = driver.getWindowHandles();
		System.out.println(thredwin);
		for (String allid2 : thredwin) 
		{
			driver.switchTo().window(allid2);
			String title2 = driver.getTitle();
			System.out.println(title2);
			if(title2.contains("Appium Conf 2024")) 
			{
				break;				
			}			
		}
		driver.findElement(By.xpath("//a[text()='View Details']")).click();
		//driver.close();
		//driver.quit();
		
		for (String ids : allids) 
		{
			driver.switchTo().window(ids);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}	
		}
		driver.close();
	}

}
