package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class products 
{
	public products(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//div[text()='Sauce Labs Backpack']")	
private WebElement Bag1;

public void setBag1(WebElement Bag1)
{
	this.Bag1=Bag1;
}
public WebElement getBag1() {
	return Bag1;
}

@FindBy(xpath="//button[text()='ADD TO CART']")
private WebElement addToCart;

public void setAddToCart(WebElement addToCart) 
{
	this.addToCart = addToCart;	
}
public WebElement getAddToCart() 
{
	return addToCart;
}
}
