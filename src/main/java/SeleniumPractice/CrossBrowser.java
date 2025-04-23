package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		String browser = "xyz";
		WebDriver driver = null;

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		case "IE":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Enter valid browser name");
			throw new BrowserExpection("Browser name is wrong");

		}

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("Title of the URL is ::" + title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
