package HandlingWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();

		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);

		Set<String> allwindows = driver.getWindowHandles();

		for (String id : allwindows) 
		{
			if(!mainwindow.equals(id))
			{

				driver.switchTo().window(id);
				System.out.println(id);
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//span[text()='Projects']")).click();
			}

		}

	}

}


//driver.get("https://www.selenium.dev/");
//driver.switchTo().newWindow(WindowType.TAB);//to open a new tab with in current window
//driver.switchTo().newWindow(WindowType.WINDOW);
//Thread.sleep(2000);