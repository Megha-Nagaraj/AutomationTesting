package PageObjectRepositoryLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class PageObj_Login {
	
	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;
	
	@FindBy(id="login2")
	private WebElement loginhome;
	
	@FindBy(id="logInModal")
	private WebElement loginPage;
		
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	private WebElement loginbtn;
	
	public void homePage() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
	}
	
	public void loginClick() {
		webLib.waitForPageToLoad();
		loginhome.click();
		System.out.println("Clicked on Login in home page");
	}
	
	public void verifyLoginDisplay() {
		
		Assert.assertEquals(true, loginPage.isDisplayed(), "Login page not displayed");
		System.out.println("Login page displayed");
	}
	
	public void loginInLoginpage() {
		loginbtn.click();
		System.out.println("Clicked on Login");
	}
	
	public void verifyAlert() throws InterruptedException {
		String expectedAlertMessage = "Please fill out Username and Password.";

		webLib.waitForPageToLoad();
		
		Alert alert = driver.switchTo().alert();
//		Capture the message from alert (reading the message)
		String alertMessage = alert.getText().trim();
		System.out.println("Alert Message is " +alertMessage);
		Thread.sleep(5000);
		
		if(expectedAlertMessage.equalsIgnoreCase(alertMessage)) {
			alert.accept();
			System.out.println("Alert message is same as expected. Alert accepted");
		} else {
			alert.dismiss();
			System.out.println("Alert message is not same as expected. Alert declined");
		}
		
	}
	
	
	public void closeBrowser() {
		webLib.closeBrowser();
		System.out.println("Browser closed");
	}


}
