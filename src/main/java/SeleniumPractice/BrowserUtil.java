package SeleniumPractice;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This Methis is used to inti the driver
	 * 
	 * @param browsername
	 * @return the methos returns driver
	 */

	public WebDriver intiBrowser(String browsername) {
		System.out.println("Browsername is" + browsername);

		switch (browsername.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "FireFox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please Enter Valid Browser name");
			throw new BrowserExpection("======INVALID BROWSER NAME==========");

		}

		return driver;
	}

	/**
	 * The Method is used to enter the URL of the application on browser
	 * 
	 * @param URL
	 */

	public void browserURL(String URL) {

		if (URL.indexOf("https") != 0 || URL.length() == 0) {
			throw new BrowserExpection("URL is not starting with HTTPS or the length of URL is Zero");
		}
		driver.get(URL);
	}

	public void browserURL(URL url) {

		driver.navigate().to(url);
	}

	/**
	 * The Method is used to get the application Title of the page
	 * 
	 * @return String value
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * The Method is used to get the PageURL of the applications
	 * 
	 * @return String
	 */

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	/**
	 * The Method used to close the browser completely
	 */

	public void quitBrowser() {
		driver.quit();
	}

	/**
	 * The Method used to close the current browser
	 */
	public void closePage() {
		driver.close();

	}

}
