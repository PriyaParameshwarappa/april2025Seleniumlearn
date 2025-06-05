package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		boolean flag = driver.findElement(By.className("img-responsive")).isDisplayed();
		System.out.println(flag);
		if (flag == true) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element not displayed");
		}
		
		
		By logo=By.className("img-responsive1");
		boolean flag1=isElementDispalyed(logo);
		System.out.println(flag1);
		

	}

	public static boolean isElementDispalyed(By locator) {
		try {

			return getElement(locator).isDisplayed();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed:" + locator);
			return false;
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
