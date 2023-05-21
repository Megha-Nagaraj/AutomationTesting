package PageObjectRepositoryLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class PageObj_ContactUs {

	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;
	Alert alert;

	@FindBy(xpath = "//*[@id='navbarExample']/ul/li[2]/a")
	private WebElement contact;

	@FindBy(xpath = "//h5[@id='exampleModalLabel']")
	private WebElement newMessageDialogBox;

	@FindBy(id = "recipient-email")
	private WebElement contactMail;

	@FindBy(id = "recipient-name")
	private WebElement contactName;

	@FindBy(id = "message-text")
	private WebElement messageText;

	@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
	private WebElement sendMessageBtn;

	public void homePage() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
	}

	public void clickContact() {
		contact.click();
		System.out.println("Clicked on Contact");
	}


	public void sendMessageBtn() {
		sendMessageBtn.click();
		System.out.println("Clicked on Send message");
	}

	public void closeBrowser() throws Exception {
		webLib.closeBrowser();
		System.out.println("Closed browser");

	}

}
