package cucumberBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	private String url = "https://www.ebay.com/";
	By menu = By.xpath("//a[text()='Health & Beauty']");
	By subMenu = By.xpath("//p[contains(text(),'Hair Care & Styling')]//parent::a");
	
	public void loadUrl() {
		
        driver.get(url);
        System.out.println(url+" loaded Successfully");
        waitforPageLoad();
	}
	
	public void clickMenu() throws InterruptedException {
		
		driver.findElement(menu).click();
		System.out.println(menu+" is clicked");
        waitforPageLoad();   
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(subMenu).click(); 
        System.out.println(subMenu+" is clicked");
        TimeUnit.SECONDS.sleep(5);
	}
}
