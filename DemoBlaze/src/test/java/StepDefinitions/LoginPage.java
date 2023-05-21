package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginPage {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_Login login = PageFactory.initElements(driver, PageObj_Login.class);

	@Given("User should be on Home page of Demoblaze")
	public void user_should_be_on_home_page_of_demoblaze() {
		login.homePage();
		System.out.println("User is on Home page");
	}

	@When("User clicks on Login button on home page")
	public void user_clicks_on_login_button_on_home_page() {
		login.loginClick();
		login.verifyLoginDisplay();
	}

	@When("User clicks on Login in Login page")
	public void user_clicks_on_login_in_login_page() {
		login.loginInLoginpage();
	}

	@Then("User should get alert message")
	public void user_should_get_alert_message() throws InterruptedException {
		login.verifyAlert();
		Thread.sleep(5);
		login.closeBrowser();
	}

}
