package cucumberBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	
	By getProduct(String product) {
		return By.xpath("//span[contains(text(),'"+product+"')]");
	}
	
	public void verifyCart(String product) {
		
		Assert.assertEquals(driver.findElement(getProduct(product)).isDisplayed(),true);
		System.out.println("Product added to cart Successfully");
		driver.quit();
	}

}
