package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementedIsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		boolean  eleSelected=driver.findElement(By.name("agree")).isSelected();
		System.out.println(eleSelected);
		driver.findElement(By.name("agree")).click();
		boolean  eleSelected1=driver.findElement(By.name("agree")).isSelected();
		System.out.println(eleSelected1);

	}

}

