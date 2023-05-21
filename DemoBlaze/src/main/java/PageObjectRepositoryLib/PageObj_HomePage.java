package PageObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class PageObj_HomePage {
	
	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;
	
	@FindBy(id = "nava")
	private WebElement  productStore;
	
	@FindBy(xpath = "//*[@id='navbarExample']/ul/li[1]/a")
	private WebElement  home;
	
	@FindBy(xpath = "//*[@id='navbarExample']/ul/li[2]/a")
	private WebElement  contact;
	
	@FindBy(xpath = "//*[@id='navbarExample']/ul/li[3]/a")
	private WebElement  aboutUs;
	
	@FindBy(id="cartur")
	private WebElement cart;
	
	@FindBy(id = "login2")
	private WebElement  login;
	
	@FindBy(id = "signin2")
	private WebElement signIn;
	
	@FindBy(id = "cat")
	private WebElement  catagories;
	
	
	public void launchWebsite() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
		System.out.println("Launched DemoBlaze website");
	}
	
	public void homePage() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void verifyHomePageDisplayed() {
		if(home.isDisplayed()) {
			System.out.println("Home page displayed");
		} else {
			System.out.println("Home page not displayed");
		}
	}
	
	public void closeBrowser() {
		webLib.closeBrowser();
	}
	

}
