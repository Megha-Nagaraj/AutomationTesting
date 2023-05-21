package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class HomePage {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_HomePage home = PageFactory.initElements(driver, PageObj_HomePage.class);

	@Given("User launches browser hits the URL")
	public void user_launches_browser_hits_the_url() {
		home.launchWebsite();
	}

	@When("User lands on Home page")
	public void user_lands_on_home_page() {
		home.homePage();
	}

	@Then("Verify User landed on home page")
	public void verify_user_landed_on_home_page() {
		home.verifyHomePageDisplayed();
		home.closeBrowser();
	}

}
