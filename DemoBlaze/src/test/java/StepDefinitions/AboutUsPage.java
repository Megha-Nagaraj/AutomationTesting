package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_AboutUs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AboutUsPage {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_AboutUs about = PageFactory.initElements(driver, PageObj_AboutUs.class);

	@Given("User should be on Home page of Demoblaze website")
	public void user_should_be_on_home_page_of_demoblaze_website() {
		about.homePage();
	}

	@When("User clicks on About us link")
	public void user_clicks_on_about_us_link() {
		about.clickAbout();
	}

	@When("Clicks on play button")
	public void clicks_on_play_button() {
		about.clickPlayBtn();
	}

	@Then("About Us dialog box appears")
	public void about_us_dialog_box_appears() {
		about.verifyAboutDialogDisplayed();
	}

	@Then("Video starts playing")
	public void video_starts_playing() throws Exception {
		Thread.sleep(5);
		about.videoPlaying();

		Thread.sleep(5);
		about.closeBrowser();
	}

}
