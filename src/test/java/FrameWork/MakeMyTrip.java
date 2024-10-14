package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable 
	{

		FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData - Copy.properties");
		Properties pro = new Properties();
		pro.setProperty("tripUrl", "https://www.makemytrip.com/");
		pro.setProperty("number", "8754895799");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/PropertiesData - Copy.properties");
		pro.store(fos, "Make-mytrip-login-deatils");
		
		///reading the daata from property file
		
		FileInputStream fis1 = new FileInputStream("./src/test/resources/PropertiesData - Copy.properties");
		Properties pro1 = new Properties();
		pro1.load(fis1);
		String URL = pro1.getProperty("tripUrl");
		
		WebDriver driver=new EdgeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

}
