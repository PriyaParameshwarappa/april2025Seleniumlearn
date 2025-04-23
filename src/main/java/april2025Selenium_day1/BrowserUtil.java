package april2025Selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method used to inti the driver on the basis of given browser name
	 * 
	 * @param browsername
	 * @return the returns driver
	 */
	public WebDriver initDriver(String browsername) {
		System.out.println("The Browser name is ::" + browsername);

		switch (browsername.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please enter valid browser");
			throw new BrowserException("Value you entered not present or invalid browser");
		// throw and break will not work at a time so need to remove break;
		}

		return driver;
	}
	
	/**
	 * This Method enter the URL for the browser
	 * @param url
	 */

	public void launchUrl(String url) {

		if (url.indexOf("http") != 0 || url.length() == 0) {
			throw new BrowserException("http(s) is missing");
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	

}
