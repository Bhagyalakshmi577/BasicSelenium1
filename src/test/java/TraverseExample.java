import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TraverseExample {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		//String name=driver.findElement(By.xpath("//p[@class='name']/../../../../../../..//div[1]/div[1]/div[1]/div[9]/p")).getText();
		//System.out.println(name);
		List<WebElement> TeamPoints = driver.findElements(By.xpath("//div[@class='table-data team']/../../../..//div[@class='table-data points']"));
		for (WebElement webElement : TeamPoints) 
		{
			System.out.println(webElement.getText());
			
		}
	}

}
