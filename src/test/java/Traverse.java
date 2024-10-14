import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Traverse {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("html/body/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header/div[1]/div[2]/form/div/button")).click();
		//String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']//../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
		String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']//../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(price);
	}
	

}
