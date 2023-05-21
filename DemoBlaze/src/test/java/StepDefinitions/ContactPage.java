package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Driver;
import PageObjectRepositoryLib.PageObj_ContactUs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ContactPage {

	public static WebDriver driver = Driver.getBrowser();

	PageObj_ContactUs contact = PageFactory.initElements(driver, PageObj_ContactUs.class);
	
	@Given("^User should be on Home page of Demoblaze application$")
    public void user_should_be_on_home_page_of_demoblaze_application() throws Throwable {
		contact.homePage();
    }

	@When("^User clicks on Contact Us button$")
    public void user_clicks_on_contact_us_button() throws Throwable {
		contact.clickContact();
    }
	
	@And("^User enter details (.+), (.+) and (.+) clicks on send button$")
    public void user_enter_details_and_clicks_on_send_button(String email, String name, String message) throws Throwable {
		driver.findElement(By.id("recipient-email")).sendKeys(email);
		driver.findElement(By.id("recipient-name")).sendKeys(name);
		driver.findElement(By.id("message-text")).sendKeys(message);
		contact.sendMessageBtn();
    }

	@Then("^User should be able to see popup message$")
	public void user_should_be_able_to_see_popup_message() throws Throwable {
		String expectedAlertMessage = "Thanks for the message!!";
		
		
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();
//		Capture the message from alert (reading the message)
		String alertMessage = alert.getText().trim();
		System.out.println("Alert Message is " + alertMessage);
		Thread.sleep(5000);

		if (expectedAlertMessage.equalsIgnoreCase(alertMessage)) {
			alert.accept();
			System.out.println("Alert message is same as expected. Alert accepted");
		} else {
			alert.dismiss();
			System.out.println("Alert message is not same as expected. Alert declined");
		}
	   
	}

}