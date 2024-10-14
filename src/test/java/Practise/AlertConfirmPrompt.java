package Practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConfirmPrompt {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("-------alert----");
		//alert popup
		
		driver.findElement(By.id("alertexamples")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.accept();
		
		System.out.println("-------confirm alert----");
		//confirm
		driver.findElement(By.id("confirmexample")).click();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement comfirmalert =driver.findElement(By.xpath("(//p[@class=\"inline-explanation\"]) [position()=2]"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(comfirmalert));
		
		System.out.println(comfirmalert);
		
		System.out.println("-------Prompt alert----");
		//Prompt alert
		driver.findElement(By.id("promptexample")).click();
		alt.sendKeys("I am bhagya");
		System.out.println(alt.getText());
		alt.accept();
		
		
	}

}
