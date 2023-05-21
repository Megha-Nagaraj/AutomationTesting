package PageObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import GenericLib.Driver;
import GenericLib.WebDriverCommonLib;

public class PageObj_AboutUs {

	WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.driver;

	@FindBy(xpath = "//*[@id='navbarExample']/ul/li[3]/a")
	private WebElement aboutUs;

	@FindBy(id = "videoModalLabel")
	private WebElement aboutDialogBox;

	@FindBy(className = "vjs-big-play-button")
	private WebElement playButton;

	@FindBy(className = "vjs-control-text")
	private WebElement pauseButton;

	public void homePage() {
		webLib.launchDemoBlaze();
		webLib.waitForPageToLoad();
		webLib.maximize();
	}

	public void clickAbout() {
		aboutUs.click();
		System.out.println("Clicked on About Us");
	}

	public void verifyAboutDialogDisplayed() {
		Assert.assertEquals(true, aboutDialogBox.isDisplayed(), "About us page is not displayed");
		System.out.println("About Us page Verified");
	}

	public void clickPlayBtn() {
		playButton.click();
		System.out.println("Clicked on Play button");
	}

	public void videoPlaying() {
		if (pauseButton.isDisplayed()) {
			System.out.println("Video is playing");
		} else {
			System.out.println("Video is not playing");
		}
	}

	public void closeBrowser() {
		webLib.closeBrowser();
		System.out.println("Browser closed");
	}

}
