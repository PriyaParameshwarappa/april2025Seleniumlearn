package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("Priya@gmail.com");
		
		//here if we id value is wrong while creating WebElement it got failed hence we will get message NOSuvhElementExcpetion 
		driver.findElement(By.id("input-email11")).sendKeys("Priya@gmail.com");
		 

	}

}
