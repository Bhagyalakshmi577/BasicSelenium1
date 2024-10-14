package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingdropdownusingSelectclass {

			public static void main(String[] args) throws Throwable {
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				Thread.sleep(3000);
				
				WebElement day = driver.findElement(By.name("birthday_day"));
				day.click();
				Select select = new Select(day);
				//method1
				//select.selectByIndex(19);
				//method2
				//select.selectByValue("8");
				//method3
				//select.selectByVisibleText("1");
				//method4
				driver.findElement(By.xpath("//option[@value='20']")).click();
				WebElement month = driver.findElement(By.name("birthday_month"));
				month.click();
				Select select1=new Select(month);
				//select1.selectByIndex(0);
				//select1.selectByValue("7");
				select1.selectByVisibleText("Jan");
				WebElement year = driver.findElement(By.name("birthday_year"));
			    year.click();
			    Select select3=new Select(year);
			    //select3.selectByIndex(34);
			    //select3.selectByValue("1998");
			    select3.selectByVisibleText("2024");

	}

}
