package cucumberBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}

	By addToCart = By.xpath("//a[contains(text(),'Add to cart')]");
	By cartIcon = By.xpath("//a[contains(@aria-label,'cart')]");
	
	By getProduct(String product) {
		return By.xpath("//h3[contains(text(),'"+product+"')]//parent::a");
	}
	
	public void selectProduct(String product) throws InterruptedException {
		
		driver.findElement(getProduct(product)).click(); 
		System.out.println("Product "+product+" is selected");
        TimeUnit.SECONDS.sleep(3);
	}
	
	public void clickAdd() throws InterruptedException {
		
		driver.findElement(addToCart).click(); 
		System.out.println("Add to cart button is clicked");
        TimeUnit.SECONDS.sleep(3);
	}
	
	public void clickCart() {
		
		driver.findElement(cartIcon).click();
		System.out.println("Shopping Cart Icon is clicked");
        waitforPageLoad();
	}
}
