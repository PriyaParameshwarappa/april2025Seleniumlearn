package april2025Selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		String browse = "priya";
		WebDriver driver = null;

		switch (browse.trim().toLowerCase()) {
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

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String s = driver.getTitle();
		System.out.println(s);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
