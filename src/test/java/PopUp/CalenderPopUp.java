package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUp {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		//case1:
		driver.findElement(By.xpath("//div[text()='August 2024']/../..//p[text()='15']")).click();
		
		//Case2:
		//driver.findElement(By.xpath("//div[text()='August 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='19']")).click();
		
		//case3:
//		String Month = "August 2024";
//		String date = "6";		
//		driver.findElement(By.xpath("//div[text()='"+Month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();


	}

}
