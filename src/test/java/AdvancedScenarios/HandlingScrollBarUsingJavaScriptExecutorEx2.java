package AdvancedScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) throws Throwable 
	{

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement service = driver.findElement(By.xpath("//a[text()='Services']"));
		System.out.println(service.getLocation().getX());
		System.out.println(service.getLocation().getY());

		//approach 1
		//		JavascriptExecutor js = (JavascriptExecutor)driver;
		//		Thread.sleep(2000);
		//		js.executeScript("window.scrollBy(329,806)");
		//		service.click();

		//approach 2
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",service);
		service.click();

	}

}
