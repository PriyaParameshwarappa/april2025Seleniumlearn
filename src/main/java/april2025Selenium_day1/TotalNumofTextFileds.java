package april2025Selenium_day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumofTextFileds {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> textfield = driver.findElements(By.className("form-control"));
		System.out.println(textfield.size());
		
		for(WebElement e:textfield) {
			String placeholdername=e.getDomAttribute("placeholder");
			System.out.println(placeholdername);
		}
	

	}

}
