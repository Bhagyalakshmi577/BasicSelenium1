import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new EdgeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		WebElement search=driver.findElement(By.name("field-keywords"));
//		//method1:
//		search.sendKeys("puma");
//		search.clear();
//		search.sendKeys("Bhagya");
//		//method 2:
//		//search.click();
//		//method3:
//		//search.submit();
//		//method4:
////		//search.clear();
//		
//		WebElement text = driver.findElement(By.xpath("//a[text()='slippers & sandals']"));
//		//method5:
//		System.out.println(text.getLocation().getX());
//		System.out.println(text.getLocation().getY());
//		
//		//method6:
//		System.out.println(text.getSize().getHeight());
//		System.out.println(text.getSize().getWidth());
//		
//		//method 7
//		System.out.println(text.getRect().getHeight());
//		System.out.println(text.getRect().getWidth());
//		System.out.println(text.getRect().getX());
//		System.out.println(text.getRect().getY());
//		
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().window().maximize();
//		WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
//		search.sendKeys("standard_user");
//		search.clear();
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("secret_sauce");
//		password.clear();
//		driver.close();
		
		/*driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
		//method 8
		if(logo.isDisplayed())
		{
			System.out.println("Facebook name is displayed");
		}
		else
		{
			System.out.println("FaceBook name is not displayed");
		}
		
		//method 9
		WebElement link = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		if(link.isEnabled())
		{
			//System.out.println("Element is enabled");
			link.click();
		}
		else
		{
			System.out.println("Element is not enabled");
		}
		
		//method 10
		Thread.sleep(3000);
		WebElement gender=driver.findElement(By.name("sex"));
		gender.click();
		if(gender.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("Not selected");
		}

		//method 11
		System.out.println(logo.getTagName());
		System.out.println(link.getTagName());
		System.out.println(gender.getTagName());*/
		
		driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
//		WebElement search = driver.findElement(By.name("field-keywords"));
//		//method 12
//		System.out.println(search.getTagName());
//		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
//		System.out.println(mobile.getTagName());
//		
//		//method 13
		//System.out.println(search.getAttribute("placeholder"));
		//System.out.println(mobile.getAttribute("data-csa-c-slot-id"));

		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		
		//method 14
		System.out.println(logo.getDomAttribute("id"));
		System.out.println(logo.getDomProperty("baseURI"));
		
		//method 15
		//this method is used to tell us which type of element is whether textbox,link,check box etc...
//		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//		System.out.println(logo.getAriaRole());
		
		//method 16
		// WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		 //System.out.println(SearchBar.getAccessibleName());	
		 
		 //method 17
		// WebElement searchbutton =driver.findElement(By.xpath("//input[@type='submit']"));
		 //System.out.println(searchbutton.getCssValue("color"));
		 //check the image colour in the link in google RGB to HEX
		
		//The colour value is present in the style tab is only for the inspected element.
		 
		 //method18
		 //gettext()
	}
	

}
