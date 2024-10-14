package Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RealScenarioOfFrame {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		WebElement frams = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frams);
		
		WebElement drag = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		Actions act=new Actions(driver);
		//act.clickAndHold(drag).release(drop).perform();
		act.dragAndDrop(drag,drop).perform();
		
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		act.dragAndDrop(drag1, drop).perform();
		
		Thread.sleep(2000);
		WebElement drag2 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
		act.dragAndDrop(drag2, drop).perform();
		
		Thread.sleep(2000);
		WebElement drag3 = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
		act.dragAndDrop(drag3, drop).perform();
		
	}

}
