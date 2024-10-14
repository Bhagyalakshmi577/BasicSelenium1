import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentAmazon {

	public static void main(String[] args) 
	{
		//For Bluetooh assigment:
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("BluetoothHeadset");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		String title=driver.getTitle();
//		System.out.println(title);
//		String Bluetoothname = driver.findElement(By.linkText("CrossBeats Shuffl Pro Neckband Bluetooth Wireless Earphones with AI Environmental Noise Cancelling 13mm Drivers EchoBlast™, 72Hrs Playtime Fast charging SnapCharge™,40ms Low Latency, BT v5.2 -Black")).getText();
//		System.out.println(Bluetoothname); 		
		
//		WebElement Bluetoothname=driver.findElement(By.linkText("CrossBeats Shuffl Pro Neckband Bluetooth Wireless Earphones with AI Environmental Noise Cancelling 13mm Drivers EchoBlast™, 72Hrs Playtime Fast charging SnapCharge™,40ms Low Latency, BT v5.2 -Black"));
//      Bluetoothname.click();
//      System.out.println(Bluetoothname);
		
		//for Pume Shoe assigment:
		driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("puma shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
//		String price = driver.findElement(By.partialLinkText("1,579")).getText();
//		System.out.println(price);
		String price=driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(price);
		

	}

}
