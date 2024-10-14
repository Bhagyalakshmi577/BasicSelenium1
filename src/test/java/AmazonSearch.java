import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearch {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.findElement(By.name("field-keywords")).sendKeys("Gym pants");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		//driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_bestsellers']")).click();
//		driver.findElement(By.cssSelector("[aria-label='Search Amazon.in']")).sendKeys("Puma");
//		driver.findElement(By.cssSelector("[value='Go']")).click();
		
		//syntax3:supports only id()
		//id()----------->#AttributeValue
//         driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");

				
		//syntax4:supports only id()
		//id()----------->htmltag#AttributeValue
//         driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		//relative xpath syntax1
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_sell_T3']")).click();
		
		driver.findElement(By.partialLinkText("")).sendKeys("");
				
	}

}
