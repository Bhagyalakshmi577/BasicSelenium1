package FrameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScreenShotEx 
{
	@Test
	public void method() throws Throwable
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file1 = new File("./Screenshot.png");
		FileUtils.copyFile(src, file1);
		
	}

}
