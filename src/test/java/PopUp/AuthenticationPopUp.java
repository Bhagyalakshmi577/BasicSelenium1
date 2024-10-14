package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		//To handle authentication pop follow this
		//https://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
