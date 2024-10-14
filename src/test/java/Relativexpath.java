import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Relativexpath {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//xpath by Attribute
		//syntax 1://htmltag[@AttributeName='Attributevalue']
		
	//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
	//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma shoes");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//xpath by VisibleText
		//syntax2://htmltag[@text()='AttributeValue']
		
//		String titilename = driver.findElement(By.xpath("//span[text()='Mens Ultimate Ease Walking Shoe']")).getText();
//		System.out.println(titilename);
//		String price=driver.findElement(By.xpath("//span[text()='1,799']")).getText();
//		System.out.println(price);
		
		//xpath by contains attribute
		//syntax3://htmltag[contains(@AttributeName,'AttributeValue')]
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("nike");
		driver.findElement(By.xpath("//input[contains(@id,'nav')]")).click();
		
		//xpath by contains by visible text
		//syntax4://htmltag[contains(text(),'AttributeValue')]
		
		//syntax5://htmltag[@AttributeName='Attributevalue' and @AttributeName='Attributevalue']
		driver.findElement(By.xpath("//a[@class='nav-a  ' and  @data-csa-c-content-id='nav_cs_bestsellers']")).click();
		
		//syntax6://htmltag[@AttributeName='Attributevalue' or @AttributeName='Attributevalue']
		driver.findElement(By.xpath("//a[@tabindex=' ' or  @data-csa-c-content-id='nav_cs_help']")).click();
		
		
		
		
		
		
		
		


	}

}
