package AdvancedScenarios;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutorEx1 {

	public static void main(String[] args) throws Throwable 
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scrolldown
		for(int i=0;i<5;i++)
		{
			//ScrollDown
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
		}
		
		//Scrollup
		for(int i=0;i<5;i++)
		{
			//js.executeScript("window.scrollBy(0,800");
			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(1000);
		}

	}

}
