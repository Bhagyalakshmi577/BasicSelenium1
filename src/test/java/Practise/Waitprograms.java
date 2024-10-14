package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitprograms {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		WebElement phnmae = driver.findElement(By.xpath("//a[text()='Sony vaio i5']"));
		//phnmae.click();
		//explicit wait---it is not working
		//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//		wait.until(ExpectedConditions.elementToBeClickable(phnmae));
		//		phnmae.click();

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(phnmae));
		phnmae.click();

		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.titleContains("STORE"));

		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		//		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		//		wait3.until(ExpectedConditions.alertIsPresent());

		//Fluent Wait
		FluentWait fwait=new FluentWait(driver);
		fwait.pollingEvery(Duration.ofSeconds(1));
		fwait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();








	}

}
