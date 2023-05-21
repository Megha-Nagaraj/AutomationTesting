package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_SignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SignUpPage {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_SignUp signup = PageFactory.initElements(driver, PageObj_SignUp.class);

	@Given("User launches browser and hits the URL")
	public void user_launches_browser_and_hits_the_url() {
		signup.homePage();
	}

	@When("User clicks on Sign Up")
	public void user_clicks_on_sign_up() {
		signup.signUpClick();
		signup.verifySignUpDisplay();
	}

	@When("User enters valid Username and password")
	public void user_enters_valid_username_and_password() throws Exception {
		signup.enterDetails();

	}

	@When("Clicks on signup button")
	public void clicks_on_signup_button() {
		signup.signUpBtn();
	}

	@Then("Verify user got the popup message")
	public void verify_user_got_the_popup_message() throws InterruptedException {
		signup.verifyAlert();
		signup.closeBrowser();
	}

}
