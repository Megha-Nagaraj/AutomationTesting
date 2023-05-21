package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_Cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class CartPage {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_Cart cart = PageFactory.initElements(driver, PageObj_Cart.class);

	@Given("Product should be added to cart")
	public void product_should_be_added_to_cart() {
		cart.homePage();

	}

	@When("User clicks on Cart button")
	public void user_clicks_on_cart_button() {
		cart.cartClick();
	}

	@Then("Product should be displayed")
	public void product_should_be_displayed() {
		cart.verifyProductDisplay();
		cart.closeBrowser();
	}

}
