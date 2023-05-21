package GenericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverCommonLib {
	
	public static WebDriverCommonLib wlib = new WebDriverCommonLib();
	public static WebDriver driver = Driver.driver;
	
	
	/**
	 * To launch DemoBlaze Website
	 */
	public void launchDemoBlaze() {
		driver.get(Constants.Url);
	}
	
	/**
	 * This is the method with the help of which we will be able to wait for the HTML document to be loaded entirely in the DOM.
	 * Implicit Wait
	 */

	public void waitForPageToLoad() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.globalWait));
	}
	
	/**
	 * Maximize window
	 */
	
	public void maximize() {
		driver.manage().window();
	}
	
	/**
	 * Close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}


}
