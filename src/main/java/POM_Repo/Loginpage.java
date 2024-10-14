package POM_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
@FindBy(id="user-name")
private WebElement UserTextFiled;

@FindBy(css="[data-test=\"password\"]")
private WebElement passwordTextFiled;

@FindBy(xpath="//input[@class='btn_action']")
private WebElement LoginButton;


//gettermethod
public WebElement getUserTextFiled() {
	return UserTextFiled;
}

public void setUserTextFiled(WebElement userTextFiled) {
	this.UserTextFiled = userTextFiled;
}

public WebElement getPasswordTextFiled() {
	return passwordTextFiled;
}

public void setPasswordTextFiled(WebElement passwordTextFiled) {
	this.passwordTextFiled = passwordTextFiled;
}

public WebElement getLoginButton() {
	return LoginButton;
}

public void setLoginButton(WebElement loginButton) {
	LoginButton = loginButton;
}

public void logInToApp(String username,String password)
{
	UserTextFiled.sendKeys(username);
	passwordTextFiled.sendKeys(password);
	LoginButton.click();
	
}

}
