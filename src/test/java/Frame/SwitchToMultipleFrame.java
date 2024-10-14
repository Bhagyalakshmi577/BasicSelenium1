package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SwitchToMultipleFrame {

	@Test
	public void  SwitchToMultipleFrame()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		WebElement TopFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(TopFrame);
		WebElement left = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(left);
		String leftname = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(leftname);
		
		driver.switchTo().parentFrame();//this will travel to immediate parent frame
		
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middleframe);
		
		String middleframetext = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		System.out.println(middleframetext);
		
		driver.switchTo().defaultContent();//this will travell to main frame
		
		driver.switchTo().frame("frame-bottom");
		
		String bottomtext = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottomtext);

	}

}
