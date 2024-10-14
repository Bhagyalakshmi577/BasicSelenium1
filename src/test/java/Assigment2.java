import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assigment2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Samsung mobiles");
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header/div[1]/div[2]/form/div/button")).click();
		//String mobileprice=driver.findElement(By.xpath("html/body/div/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
		//System.out.println(mobileprice);
		//String mobilename=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)']")).getText();
		//System.out.println(mobilename);
    	List<WebElement> name = driver.findElements(By.cssSelector(".KzDlHZ"));
    	List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
    	
    	int pricecount=0;
    	for (WebElement webElementprice : allprice) 
    	{
			System.out.println(webElementprice.getText());
			pricecount++;
		}
    	System.out.println(pricecount);
    	
//    	for (WebElement webElement : name) 
//    	{
//    		//System.out.println(webElement.getText());
//    		System.out.println(webElement);
//			
//		}
    	int count=0;
		Iterator<WebElement> t=name.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next().getText());
			count++;
		}
		System.out.println(count);

	}
	 

}
