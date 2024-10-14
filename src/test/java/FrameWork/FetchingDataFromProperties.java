package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchingDataFromProperties {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//normal approach
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//step1: set the path of the physical file
		//FileInputStream fis = new FileInputStream("C:\\Users\\laksh\\OneDrive\\Desktop\\PropertiesData.properties");//---reading from local
		FileInputStream fis = new FileInputStream("./src/test/resources/PropertiesData - Copy.properties");
		
		//step2:Load all the dats's into properties class
		Properties pop = new Properties();
		pop.load(fis);
		
		//step3:fetching datas from properties files.
		String url = pop.getProperty("url");
		String us = pop.getProperty("username");
		String pwd = pop.getProperty("password");
		
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys(us);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login-button")).click();
		
		
		
		


	}

}
