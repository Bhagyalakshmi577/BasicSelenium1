import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day15Assignment {

	private static Object search;

	public static void main(String[] args) 
	{

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		WebElement search=driver.findElement(By.xpath("(//input[@class='flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700'])[2]"));
		search.sendKeys("mangos",Keys.ENTER);
		//List<WebElement> mango1 = driver.findElements(By.xpath("//h3[text()='Lalbagh Mango - Sindhura']|//h3[text()='Lalbagh Mango - Sindhura']/ancestor::div[@class=\"SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP\"]//descendant::span[@class=\"Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi\"]"));
		//System.out.println(mango1);
		//List<WebElement> mango2=driver.findElements(By.xpath("//h3[text()='Mango - Banganpalli']|//h3[text()='Mango - Banganpalli']/ancestor::div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP']//descendant::span[@class=\"Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi\"]"));
	    //System.out.println(mango2);
//	    List<WebElement> mango3 = driver.findElements(By.xpath("//h3[text()='Alphonso Mango - Badami']|//h3[text()='Alphonso Mango - Badami']/ancestor::div[@class=\"SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP\"]//descendant::span[@class=\"Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi\"]"));
//	    for(int i=0;i<=mango3.size();i++)
//	    {
//	    	System.out.println(mango3.get(i).getText());
//	    }
//	
	    WebElement mango3 = driver.findElement(By.xpath("//h3[text()='Alphonso Mango - Badami']/ancestor::div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP']//descendant::span[10]"));
	    mango3.getText();
		
	}
	
	

}
