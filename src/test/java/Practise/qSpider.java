package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class qSpider {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://chat.qspiders.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("8754895799");
		driver.findElement(By.id("password")).sendKeys("Bhagya@1998");
		driver.findElement(By.xpath("//button[text()='Login']")).click();


	}

}
