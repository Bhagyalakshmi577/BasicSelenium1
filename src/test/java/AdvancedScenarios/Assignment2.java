package AdvancedScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement signin =driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[position()=2]"));
		act.moveToElement(signin).perform();
		//uusing key class
		//signin.click();
		Thread.sleep(2000);
		//Robot rot=new Robot();
		WebElement order = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		act.moveToElement(order).click().build().perform();
		driver.findElement(By.name("email")).sendKeys("lakshmiananda99@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bhagya@1998");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement orders = driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		act.moveToElement(orders);
		Thread.sleep(3000);
		orders.click();
		driver.findElement(By.xpath("//div[@data-card-identifier='AddressesAnd1Click']")).click();
		driver.findElement(By.xpath("//div[@class='a-box first-desktop-address-tile']")).click();
		driver.findElement(By.name("address-ui-widgets-enterAddressFullName")).sendKeys("Bhagyalakshmi");
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("8754895799");
		driver.findElement(By.xpath("//input[@placeholder='6 digits [0-9] PIN code']")).sendKeys("600088");
		driver.findElement(By.name("address-ui-widgets-enterAddressLine1")).sendKeys("Sri Karpaga Nivas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@aria-required='false'])[position()=1]")).sendKeys("1st Street, Telephone Colony, Adambakkam");
		driver.findElement(By.xpath("//input[@placeholder='E.g. near apollo hospital']")).sendKeys("NGO colony");
		WebElement city = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		city.clear();
		city.sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")).click();
		driver.findElement(By.xpath("//a[text()='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='deleteAddressModal-0-submit-btn-announce']")).click();
	}

}
