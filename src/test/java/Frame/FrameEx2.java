package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameEx2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//Switching frame using index----index value starts from 0
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qspider");
		
		//Switching frame using id Attribute----
		//driver.switchTo().frame("singleframe");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qspider");
		
		//Switching frame using name Attribute----
		//driver.switchTo().frame("SingleFrame");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qspider");
		
		//Switching frame using webelement
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qspider");
		
		
		//single frame is //iframe and if it is nested frame then //frame only 
		
	}

}
