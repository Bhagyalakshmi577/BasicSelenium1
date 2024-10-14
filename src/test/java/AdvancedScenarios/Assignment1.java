package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[position()=2]")).sendKeys("apple");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
		Thread.sleep(3000);
		for (WebElement applelist : list) 
		{
			//System.out.println(applelist.getText());
			try {
				if(applelist.getText().contains("Apple - Pink Lady"))
				{
			applelist.click();
				}
				
			} catch (Exception e) 
			{
				Thread.sleep(3000);
				String applename=driver.findElement(By.xpath("//section[@class='Description___StyledSection-sc-82a36a-0 jMGGnR']")).getText();
				System.out.println(applename);
//				 JavascriptExecutor js=(JavascriptExecutor)driver;
//				 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				Actions action=new Actions(driver);
				WebElement add = driver.findElement(By.xpath("//div[@class='flex flex-col lg:w-60 xl:w-82']"));
				action.moveToElement(add).click().build().perform();
				Thread.sleep(3000);
				//driver.findElement(By.xpath("(//button[@class='Button-sc-1dr2sn8-0 PdCartCTA___StyledButton2-sc-mq73zq-3 kYQsWi bwKrKT group false group false'])[position()=1]")).click();

				driver.findElement(By.xpath("(//*[name()='svg' and @fill='none'])[position()=9]")).click();
			}
			
			
		}
		
	}

}
