package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

public class ProfilePage extends BasePage{
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	@FindBys({
		@FindBy(id="books-wrapper"),
		@FindBy(id="userName-value")
	})
	WebElement user;
	
	@FindBy(id="submit")
	WebElement logoutBtn;
	
	public void verifyUser(String usrNm){

			addExplicitWait(user, 20);
			Assert.assertEquals(user.getText().toLowerCase(),usrNm.toLowerCase());
			System.out.println("Correct username, ie " +user.getText());
	}
	
	public void logout_Action(){
		System.out.println("Let's log off now!!!!");
		click(logoutBtn);
	}

}
