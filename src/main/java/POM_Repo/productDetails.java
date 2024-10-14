package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetails 
{
	public productDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
public WebElement nameOfTheProduct;

@FindBy (xpath="//div[@class='inventory_details_desc']")
public WebElement priceDetails;

@FindBy(xpath="//div[@class='inventory_details_price']")
private WebElement price;



//public void setNameOfTheProduct(WebElement nameOfTheProduct) {
//	this.nameOfTheProduct = nameOfTheProduct;
//}
//
//public void setPriceDetails(WebElement priceDetails) {
//	this.priceDetails = priceDetails;
//}
//
//public void setPrice(WebElement price) {
//	this.price = price;
//}


//public WebElement getNameOfTheProduct() {
//	return nameOfTheProduct;
//}
//
//public WebElement getPriceDetails() {
//	return priceDetails;
//}
//
//public WebElement getPrice() {
//	return price;
//}

public void gettextValue()
{
	System.out.println(nameOfTheProduct.getText());
	System.out.println(priceDetails.getText());
	System.out.println(price.getText());
}


}
