package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com");
		/*
		 * driver.get(
		 * "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 * driver.findElement(By.id("input-email")).sendKeys("test@priya.com"); String
		 * valueOfText = driver.findElement(By.id("input-email")).getAttribute("value");
		 * System.out.println(valueOfText);
		 * 
		 * // When Value attribute not present WebDriver driver1 = new ChromeDriver();
		 * 
		 * driver1.get("https://thinking-tester-contact-list.herokuapp.com");
		 * driver1.findElement(By.id("email")).sendKeys("Priya@gmail.com");
		 * driver1.findElement(By.id("password")).sendKeys("Priya123"); String attvalu =
		 * driver1.findElement(By.id("email")).getAttribute("value"); String attvalu2 =
		 * driver1.findElement(By.id("password")).getAttribute("value");
		 * System.out.println("Email id is=" + attvalu + "Password value is =" +
		 * attvalu2);
		 * 
		 * By email=By.id("email"); By password=By.id("password");
		 */
		By email=By.id("email");
		By password=By.id("password");
		By link=By.linkText("here");
		
		doSendKeys(email, "Priya.konemae@gmail.com");
		String v1=doElementGetAttribute(email, "value");
		System.out.println(v1);
		
		
		//doSendKeys(password, "Test123");
		String v2pass=doElementGetAttribute(password, "placeholder");
		System.out.println(v2pass);
		
		String linktextvalue=doElementGetAttribute(link, "href");
		System.out.println(linktextvalue);
		
		
		

	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doElementGetAttribute(By locator,String attValue) {
		return getElement(locator).getAttribute(attValue);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
