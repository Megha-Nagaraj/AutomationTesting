package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driver {

	public static WebDriver driver;

	public static WebDriver getBrowser() {

		if (Constants.browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

//			Launch light and empty driver
			driver = new ChromeDriver();
//			driver.manage().window().maximize();

		} else if (Constants.browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.driver",
					"..\\DemoBlaze\\Driver\\geckodriver.exe");

			// Change the constructor as per the Browser
			driver = new FirefoxDriver();

		} else if (Constants.browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"..\\DemoBlaze\\Driver\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			
		} else if (Constants.browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"..\\DemoBlaze\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
		}

//		implement for microsoft edge

		return driver;
	}

}
