package april2025Selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIDClose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		//System.out.println(driver.getTitle()); //NoSuchSessionException
		
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
