import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dream11 {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.dream11.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		String PageSource=driver.getPageSource();
		//System.out.println(PageSource);
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		//driver.close();
		driver.quit();

	}

}
