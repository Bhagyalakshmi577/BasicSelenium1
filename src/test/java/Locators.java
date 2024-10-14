import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//this is using id
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//This is using name
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//This is Using class
		driver.findElement(By.className("btn_action")).click();
		
		//cssselector syntax
		//syntax1:[AttributeName='AttributeValue]--This is cssselector --this will accept all attribute name like id,name,partial text,limked text and other name
//		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("[value='LOGIN']")).click();
		
		//syntax2:htmltag[AttributeName='AttributeValue]
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		
		//syntax3:supports only id()
		//id()----------->#AttributeValue
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		//syntax4:supports only id()
		//id()----------->htmltag#AttributeValue
//		driver.findElement(By.cssSelector("input#login-button")).click();
		
		//syntax5: supports only class()
		//class()----------->.AttributeValue
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector(".submit-button")).click();
		//syntax6: supports only class()
		//class()----------->htmltag.AttributeValue
		driver.findElement(By.cssSelector("input.submit-button")).click();
		

	}

}
