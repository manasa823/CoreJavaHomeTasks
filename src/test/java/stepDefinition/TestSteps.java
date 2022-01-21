package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumberBase.BasePage;
import cucumberBase.CartPage;
import cucumberBase.HomePage;
import cucumberBase.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	WebDriver driver = BasePage.getDriver();
	HomePage home = new HomePage(driver);
	ProductPage objProduct = new ProductPage(driver);
	CartPage cart = new CartPage(driver);
	
	@Given("user is in Home Page")
	public void user_is_in_home_page() {
		home.loadUrl();
	}
	
	@When("user clicks on a Menu Item")
	public void user_clicks_on_a_menu_item() throws InterruptedException {  
		home.clickMenu();
	}
	
	@When("user clicks on Add to Cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
	    objProduct.clickAdd();
	}
	
	@When("user navigates to shopping cart page")
	public void user_navigates_to_shopping_cart_page() {
		objProduct.clickCart();
	}
	
	@When("user clicks on {string}")
	public void user_clicks_on_product(String product) throws InterruptedException {
		objProduct.selectProduct(product);
	}
	
	
	 @Then("user should find the {string} in cart") 
	 public void user_should_find_the_product_in_cart(String product) {
	  cart.verifyCart(product); 
	  }
}
