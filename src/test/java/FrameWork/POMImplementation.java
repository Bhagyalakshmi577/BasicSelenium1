package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM_Repo.Loginpage;
import POM_Repo.productDetails;
import POM_Repo.products;

public class POMImplementation {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
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
		
//		Loginpage login=new Loginpage(driver);
//		login.getUserTextFiled().sendKeys(us);
//		login.getPasswordTextFiled().sendKeys(pwd);
//		login.getLoginButton().click();
		
		//using page
		Loginpage login=new Loginpage(driver);
		login.logInToApp(us, pwd);
		
		products prod=new products(driver);
		prod.getBag1().click();
		prod.getAddToCart().click();
		
		productDetails det=new productDetails(driver);
		det.gettextValue();
		
		
		


	}

}
