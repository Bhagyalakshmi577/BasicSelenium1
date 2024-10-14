package HandlingWindow;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class GoibiboAssignment {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='CountryType'])[1]")).click();
		Thread.sleep(2000);
		WebElement place = driver.findElement(By.xpath("//input[@data-testid=\"home-autosuggest-input\"]"));
		place.click();
		WebElement triplace = driver.findElement(By.xpath("//p[text()='Mysore']"));
		triplace.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Travel Dates'])[1]")).click();
		String Month = "August 2024";
		String date1 = "10";
		List<WebElement> checkingcheckout = driver.findElements(By.xpath("//span[text()='August 2024']/ancestor::div[@class='dcalendar-newstyles__CalenderMonthContainer-sc-1i003by-2 dHuCDl']/descendant::span[text()='22'] | //span[text()='August 2024']/ancestor::div[@class='dcalendar-newstyles__CalenderMonthContainer-sc-1i003by-2 dHuCDl']/descendant::span[text()='23'] "));
		for (WebElement webElement : checkingcheckout) 
		{
			webElement.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role=\"presentation\"]")).click();
		driver.findElement(By.xpath("//input[@value='2 Adults  . 1 Room ']")).click();
		WebElement rooms = driver.findElement(By.xpath("//span[@data-testid=\"button-room-add\"]"));
		for(int s=0;s<1;s++)
		{
			rooms.click();
		}
		WebElement Chindren = driver.findElement(By.xpath("//span[@data-testid='button-child-add']"));
		for(int s=0;s<=2;s++)
		{
			Chindren.click();
		}
		List<WebElement> select = driver.findElements(By.xpath("//*[@class=\"ArrowDownIcon-sc-1rvxdsg-0 kAwvPa\"]"));
		for (WebElement webElement : select) 
		{
			webElement.click();
			driver.findElement(By.xpath("//li[text()='3']")).click();
		}
		driver.findElement(By.xpath("//span[text()='Adults']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();


	}

}
