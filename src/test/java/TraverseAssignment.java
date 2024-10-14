import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TraverseAssignment {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='close-btn']")).click();
		String point=driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../../div[@class='table-data matches-play']/p[@class='count']")).getText();
		System.out.println(point);
		String win=driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../../div[@class='table-data matches-won']/p[@class='count']")).getText();
		System.out.println(win);
		String loss=driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../../div[@class='table-data matches-lost']/p[@class='count']")).getText();
		System.out.println(loss);
		String draw=driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../../div[@class='table-data matches-draw']/p[@class='count']")).getText();
		System.out.println(draw);
		
		
		
		
		
		
		
		//List<WebElement> puneriteampoints=driver.findElements(By.xpath("//p[text()='Puneri Paltan']/../../../../div"));
//		for (WebElement webElement : puneriteampoints) 
//		{
//			System.out.println(webElement.getText());
//			
//		}
	}

}
