package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert is an interface
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//Thread.sleep(2000);
		
		//Alert alt = driver.switchTo().alert();
		//Alert with only ok
		
		/*//method2
		String alrmsg = alt.getText();
		System.out.println(alrmsg);
		
		//method1
		alt.accept();*/
		
		//confirm alert
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		//method3
		//To click ok from alert
		//driver.switchTo().alert().accept();
		//method4
		//To click cancel from alert
		//driver.switchTo().alert().dismiss();*/
		
		//prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//Alert alt = driver.switchTo().alert();
		//alt.sendKeys("Hi Hello");
		//alt.accept();
		
		//or
		
		driver.switchTo().alert().sendKeys("Hi ma bhagya selenium learn pandriya all the best da");
		driver.switchTo().alert().accept();
		
		

	}

}
