package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchingPrivateWindows {

	public static void main(String[] args) 
	{
		//Chrome :
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--incognito");
//		
//		WebDriver driver=new ChromeDriver(opt);
//		driver.manage().window().maximize();

		
		//Edge
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--InPrivate");
		
		WebDriver driver=new EdgeDriver(opt);
		driver.manage().window().maximize();
	}

}
