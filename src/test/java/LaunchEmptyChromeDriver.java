import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEmptyChromeDriver {

	public static void main(String[] args) {

		//Case 1
		//		String key="Webdriver.chrome.driver";
		//		String value="./src/main/resources/chromedriver.exe";
		//		System.setProperty(key, value);
		//		WebDriver driver=new EdgeDriver();
		//		driver.get("https://mail.google.com/mail/u/0/#inbox");
		//		String Title=driver.getTitle();
		//		String URL=driver.getCurrentUrl();
		//		String Pagesource=driver.getPageSource();
		//		
		//		System.out.println(Title);
		//		System.out.println(URL);
		//		System.out.println(Pagesource);

		//Case2:
		//		WebDriverManager.chromedriver().setup();
		//		WebDriver driver=new ChromeDriver();

		//		WebDriverManager.edgedriver().setup();
		//		WebDriver driver=new EdgeDriver();

		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver=new FirefoxDriver();

		//Case3:
		//     WebDriver driver=new ChromeDriver();
		//     WebDriver driver=new EdgeDriver();


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

	}

}
