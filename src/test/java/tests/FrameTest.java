package tests;

import pages.BaseTest;
import pages.FramesPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class FrameTest extends BaseTest {
	
	@Test
	public void Test() {
		
		launchBaseURL("https://demoqa.com/frames");
		
		FramesPage frm = PageFactory.initElements(driver, FramesPage.class);
		
		frm.switchToFrame1();
		frm.switchToFrame2();
	}

}
