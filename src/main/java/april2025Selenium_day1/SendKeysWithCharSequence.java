package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String name="Priya";
		StringBuffer sbuf=new StringBuffer("Automation");
		StringBuilder sb=new StringBuilder("Lab");
		
		driver.findElement(By.id("input-email")).sendKeys(name, " " , sbuf ,"",sb + "Selenium");
	}

}
