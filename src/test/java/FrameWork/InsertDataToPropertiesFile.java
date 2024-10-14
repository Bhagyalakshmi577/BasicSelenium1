package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable 
	{
		//insert Data
		FileInputStream fis = new FileInputStream("./src/test/resources/InserData.properties");//keep the file in read mode 

		Properties pro = new Properties();
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");

		FileOutputStream fos = new FileOutputStream("./src/test/resources/InserData.properties");//keep the file in Write mode
		pro.store(fos, "commonData");

		// Now we are reading the file and executing the script---------------
		
		FileInputStream Read = new FileInputStream("./src/test/resources/InserData.properties");

		Properties readpro = new Properties();
		readpro.load(Read);
		
		String url = readpro.getProperty("url");
		String username = readpro.getProperty("username");
		String password = readpro.getProperty("password");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();




	}

}
