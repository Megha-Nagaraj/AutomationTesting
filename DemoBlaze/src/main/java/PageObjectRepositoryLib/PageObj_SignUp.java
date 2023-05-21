package PageObjectRepositoryLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.ExcelLib;
import GenericLib.WebDriverCommonLib;

public class PageObj_SignUp {
	
	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;
	ExcelLib excel = new ExcelLib();
	
	@FindBy(id = "signin2")
	private WebElement signUp;
	
	@FindBy(id="signInModal")
	private WebElement signUpPage;
	
	@FindBy(id="sign-username")
	private WebElement username;
	
	@FindBy(id="sign-password")
	private WebElement password;
	
	
	@FindBy(xpath ="//*[@id='signInModal']/div/div/div[3]/button[2]")
	private WebElement signUpbtn;
	
	
	
	public void homePage() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
	}
	
	public void signUpClick() {
		webLib.waitForPageToLoad();
		signUp.click();
		System.out.println("Clicked on SignUp in home page");
	}
	
	public void verifySignUpDisplay() {
		
		Assert.assertEquals(true, signUpPage.isDisplayed(), "Sign Up page not displayed");
		System.out.println("SignUp page displayed");
	}
	
	public void enterDetails() throws Exception {
		username.sendKeys(excel.getStringExcelData("Sheet1", 1, 3));
		password.sendKeys(excel.getStringExcelData("Sheet1", 1, 4));
		
		System.out.println("Credentials Entered");
	}
	
	public void signUpBtn() {
		signUpbtn.click();
		System.out.println("Clicked on Login");
	}
	
	public void verifyAlert() throws InterruptedException {
		
		String expectedMessage = "This user already exist.";
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		webLib.waitForPageToLoad();
//		Capture the message from alert (reading the message)
		String alertMessage = alert.getText().trim();
		System.out.println("Alert Message is " +alertMessage);
		Thread.sleep(5000);
		if(expectedMessage.equalsIgnoreCase(alertMessage)) {
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
