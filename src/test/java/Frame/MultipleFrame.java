package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleFrame {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		//bottom frame
//		WebElement bottom = driver.findElement(By.name("frame-bottom"));
//		driver.switchTo().frame(bottom);
//		String text = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
//		System.out.println(text);

		//left frame
		//reach parent frame and then switch to child frame;
		WebElement parentframe = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(parentframe);
		WebElement childframe = driver.findElement(By.name("frame-left"));
		driver.switchTo().frame(childframe);
		String left = driver.findElement(By.xpath("//body[contains(text(),'   LEFT')]")).getText();
		System.out.println(left);
	}

}
