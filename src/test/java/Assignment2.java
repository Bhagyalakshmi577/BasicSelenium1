import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 extends WebelementlistExample{

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("Samsung mobiles");
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header/div[1]/div[2]/form/div/button")).click();
		//List<WebElement> name = driver.findElements(By.cssSelector(".KzDlHZ"));
    	//List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
//    	String mobileprice=driver.findElement(By.xpath("html/body/div/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
//    	String mobilename=driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F14 5G (GOAT Green, 128 GB)']")).getText();
//    	LinkedHashMap<String, String> pair=new LinkedHashMap<String, String>();
//    	pair.put(mobileprice, mobilename);
//    	System.out.println(pair);
		
		List<WebElement> name = driver.findElements(By.cssSelector(".KzDlHZ"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));	
//    	LinkedHashMap<List<WebElement>, List<WebElement>> listHashMap =new LinkedHashMap<List<WebElement>, List<WebElement>>();
//    	listHashMap.put(name, allprice);
//    	Set<List<WebElement>> keys=listHashMap.keySet();
    	for (int i=0;i<name.size();i++) 
    	{
    		//String Mobilename=name.get(i).getText();
    		//String elementPrice = allprice.get(i).getText(); // Get the price text
    		//System.out.println(Mobilename+"==================================================="+elementPrice);
    		System.out.println(name.get(i).getText() +" ====" +allprice.get(i).getText());
			
		}
    	
    
    	
    
    	    	

	}

}
