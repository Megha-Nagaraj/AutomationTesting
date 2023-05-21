package PageObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class PageObj_Cart {

	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;

	@FindBy(id = "cartur")
	private WebElement cart;

	@FindBy(id = "tbodyid")
	private WebElement productDisplay;

	public void homePage() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
	}

	public void cartClick() {
		webLib.waitForPageToLoad();
		cart.click();
		System.out.println("Clicked on Cart");
	}

	public void verifyProductDisplay() {
		Assert.assertEquals(true, productDisplay.isDisplayed(), "Product not displayed");
		System.out.println("Product displayed");
	}

	public void closeBrowser() {
		webLib.closeBrowser();
		System.out.println("Browser closed");
	}

}
