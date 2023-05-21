package PageObjectRepositoryLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class PageObj_PurchaseProduct {
	
	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;
	
	@FindBy(className = "list-group-item")
	private WebElement  phoneCategory;
	
	@FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
	private WebElement  firstPhone;
	
	@FindBy(className = "name")
	private WebElement  nameOfProduct;
	
	@FindBy(className = "price-container")
	private WebElement  priceOfProduct;
	
	@FindBy(id="more-information")
	private WebElement  productDescription;
	
	@FindBy(linkText = "Add to cart")
	private WebElement  AddToCartBtn;
	
	public void homePage() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
	}
	
	public void clicksOnPhoneCategory() {
		
		phoneCategory.click();
		System.out.println(driver.getTitle());
		
	}
	
	public void clicksOnfirstPhone() {
		
		firstPhone.click();
		System.out.println(driver.getTitle());
		
	}
	
	public void verifyDetails() {
		Assert.assertEquals(true, nameOfProduct.isDisplayed());
		Assert.assertEquals(true, priceOfProduct.isDisplayed());
		Assert.assertEquals(true, productDescription.isDisplayed());
	}
		
		public void addToCart() {
		AddToCartBtn.click();
		System.out.println("Clicked on \"Add to Cart\" button");
	}
	
	public void verifyAlertMessage() throws Exception {
		String expectedAlertMessage = "Product added";
		
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
	
	public void closeBrowser() throws Exception{
		webLib.closeBrowser();
		System.out.println("Closed browser");
		
	}

}
