package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;

public class LoginPage extends BasePage{

	
	public LoginPage(WebDriver driver) {
		super(driver);
	}


	@FindAll({
		@FindBy(id="wrapper"),
		@FindBy(id="userName")
	})
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pswd;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	
	public void LogIn_Action(String uName, String pwd){
		waitforPageLoad();
		type(username,uName);
		type(pswd,pwd);
		clickUsingJavascriptExecutor(loginBtn);
	}
}
