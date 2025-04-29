package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		/*
		 * // 1st Approch driver.get(
		 * "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 * driver.findElement(By.id("input-email")).sendKeys("Priya.konemane@gmail.com")
		 * ; driver.findElement(By.id("input-password")).sendKeys("Test123");
		 */
		
		
		
		
		/*
		 * // 2nd Approch WebElement email = driver.findElement(By.id("input-email"));
		 * WebElement password = driver.findElement(By.id("input-password"));
		 * email.sendKeys("Priya.konemane@gmail.com"); password.sendKeys("Test123");
		 */
		
		
		
		//3rd Approch 
		
		/*
		 * By email=By.id("input-email"); By Password=By.id("input-password");
		 * 
		 * driver.findElement(email).sendKeys("Priya@gmail.com");
		 * driver.findElement(Password).sendKeys("Test123");
		 */
		
		
		//4th approch 
		
		/*
		 * By email=By.id("input-email"); By Password=By.id("input-password");
		 * 
		 * WebElementConcepts.getElement(email).sendKeys("Priya@gmail.com");
		 * WebElementConcepts.getElement(Password).sendKeys("Test123");
		 */
		
		//5th approch 
		
		By email=By.id("input-email");
		By Password=By.id("input-password");
		
		WebElementConcepts.dosendkeys(email, "Priya.konemane@gmail.com");
		WebElementConcepts.dosendkeys(Password, "Test123");
	
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void dosendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	

}
