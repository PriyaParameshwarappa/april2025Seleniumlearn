package april2025Selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("google")) {
			System.out.println("Test Case pass ");
		}else {
			System.out.println("Test Case Fail");
		}
		
		driver.quit();
		
		driver.close();

	}

}
