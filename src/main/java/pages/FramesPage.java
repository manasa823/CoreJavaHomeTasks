package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramesPage extends BasePage{

	public FramesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="frame1")
	WebElement frame1;
	
	@FindBy(id="frame2")
	WebElement frame2;
	
	@FindBy(xpath="//h1[@id='sampleHeading']")
	WebElement heading;
	
	public void switchToFrame1() {
		
		waitforPageLoad();
		switchToFrameByWebElement(frame1);
		Assert.assertEquals(heading.isDisplayed(), true);
		System.out.println("Switched to frame1");
	}
	
	public void switchToFrame2() {
		
		switchToWindow();
		switchToFrameByWebElement(frame2);
		Assert.assertEquals(heading.isDisplayed(), true);
		System.out.println("Switched to frame2");
	}

}
