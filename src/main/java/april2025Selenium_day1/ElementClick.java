package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// create web Element + perform the action
		// driver.findElement(By.linkText("Login")).click();

		By loginLink = By.linkText("Login");
		By RegisterLink = By.linkText("Register");
		By agreeCB = By.name("agree");

		ElementClick.doClick(loginLink);
		System.out.println("Clicked Login");
		ElementClick.doClick(RegisterLink);
		ElementClick.doClick(agreeCB);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
