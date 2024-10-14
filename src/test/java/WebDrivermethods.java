import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		//method1:To launch application
		driver.get("https://www.amazon.in/");
		
		//method2:to get the title of the webpage
		String title=driver.getTitle();
		System.out.println("The title of amazon:" +title);
		
		//method3:to get the current URL in the console
		String geturl=driver.getCurrentUrl();
		System.out.println(geturl);
		
		//method4: To get the Source code
		String source=driver.getPageSource();
		//System.out.println(source);
		
		//method 5: To maximize the window
//		Options man = driver.manage();
//		Window win = man.window();
//		win.maximize();
		
		//Or try this
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();

	}

}
