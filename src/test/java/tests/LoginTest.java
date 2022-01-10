package tests;

import pages.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class LoginTest extends BaseTest{

	@Test
	public void Test() {
		
		launchBaseURL("https://demoqa.com/login");
		
		LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
		ProfilePage profilePg = PageFactory.initElements(driver, ProfilePage.class);
		
		loginPg.LogIn_Action("Manasa", "Manunag@823");
		profilePg.verifyUser("Manasa");
		profilePg.logout_Action();
	}
	
}
