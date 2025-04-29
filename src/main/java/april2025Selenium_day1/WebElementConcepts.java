package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {
	// ID
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// First Approach
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("Priya.konemane@gmail.com")
		 * ; driver.findElement(By.id("input-password")).sendKeys("Test123");
		 */

		// Second Approach

		/*
		 * WebElement userid=driver.findElement(By.id("input-email")); WebElement
		 * password=driver.findElement(By.id("input-password"));
		 * userid.sendKeys("Priya.konemane@gmail.com"); password.sendKeys("Test123");
		 */

		// Third Approach

		/*
		 * By emailid=By.id("input-email"); By passwd=By.id("input-password");
		 * 
		 * 
		 * WebElement eid=driver.findElement(emailid); WebElement
		 * pswrd=driver.findElement(passwd);
		 * 
		 * eid.sendKeys("Priya@gmail.com"); pswrd.sendKeys("Test123");
		 */

		// 4th approch

		/*
		 * By emailid1=By.id("input-email"); By passwd1=By.id("input-password");
		 * getElement(emailid1).sendKeys("Priya@gmail.com");
		 * getElement(passwd1).sendKeys("Test123");
		 */

		// 5th approch
		  
		/*
		 * By emailid1=By.id("input-email"); By passwd1=By.id("input-password");
		 * 
		 * doSendKeys(emailid1, "Priya@gmail.com"); doSendKeys(passwd1, "Test123");
		 */
		  
		  //6th approch 
		  By emailid1=By.id("input-email"); 
		  By passwd1=By.id("input-password");
		  
		  ElementUtil eu=new ElementUtil(driver);
		  eu.doSendKeys(emailid1, "Priya.konemane@gmail.com");
		  eu.doSendKeys(passwd1, "Test123");
		  
		 		  
		  

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);

	}

}
