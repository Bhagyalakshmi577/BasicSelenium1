import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practisemyntra {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		String TitlePage = driver.getTitle();
		System.out.println(TitlePage);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
//		//driver.close();
//		driver.quit();
		
		

	}

}
