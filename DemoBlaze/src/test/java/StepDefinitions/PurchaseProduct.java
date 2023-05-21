package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_PurchaseProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class PurchaseProduct {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_PurchaseProduct purchase = PageFactory.initElements(driver, PageObj_PurchaseProduct.class);

	@Given("User is on the homepage of demoblaze")
	public void user_is_on_the_homepage_of_demoblaze() {
		purchase.homePage();
		System.out.println("User is on Home page");
	}

	@When("User clicks on {string} category")
	public void user_clicks_on_category(String string) {
		purchase.clicksOnPhoneCategory();
		System.out.println("User clicked on Phone category");
	}

	@When("User clicks on the firts product displayed on Phone category")
	public void user_clicks_on_the_firts_product_displayed_on_phone_category() {
		purchase.clicksOnfirstPhone();
		purchase.verifyDetails();
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
		purchase.addToCart();
	}

	@Then("User should be able to see {string} popup message")
	public void user_should_be_able_to_see_popup_message(String string) throws Exception {

		Thread.sleep(5000);
		purchase.verifyAlertMessage();

		purchase.closeBrowser();

	}

}
