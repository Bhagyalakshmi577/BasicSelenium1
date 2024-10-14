import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssSelectorpratise {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("women 3/4th gym pants");
		driver.findElement(By.cssSelector("[value='Go']")).click();
		//driver.findElement(By.linkText("XL")).click();
		driver.findElement(By.cssSelector(".nav-cart-icon")).click();

	}

}
