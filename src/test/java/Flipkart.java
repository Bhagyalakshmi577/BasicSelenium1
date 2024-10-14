import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//partial test:
		//driver.findElement(By.partialLinkText("Gro")).click();
		
		//Relative xpath:
		//xpath by Attribute
				//syntax 1://htmltag[@AttributeName='Attributevalue']
		//xpath by VisibleText
				//syntax2://htmltag[@text()='AttributeValue']
		//xpath by contains attribute
				//syntax3://htmltag[contains(@AttributeName,'AttributeValue')]
		//xpath by contains by visible text
				//syntax4://htmltag[contains(text(),'AttributeValue')]
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Samsung mobiles");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();--relative xpath
		//absolute xpath
		
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header/div[1]/div[2]/form/div/button")).click();
		String mobileprice=driver.findElement(By.xpath("html/body/div/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(mobileprice);
		String mobilename=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)']")).getText();
		System.out.println(mobilename);
		
  		  ArrayList<WebElement> names=(ArrayList<WebElement>) driver.findElements(By.partialLinkText("SAMSUNG Galaxy F"));
          Iterator<WebElement> t=names.iterator();
          while(t.hasNext())
          {
        	  System.out.println(t.next());
          }
		
		
//		String Allmobilenames=driver.findElements(By.partialLinkText("SAMSUNG Galaxy F")).getText();
//		System.out.println(Allmobilenames);

	}

}
