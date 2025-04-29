package april2025Selenium_day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SessionId_Interview {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//Here three three session id will be created
		
		driver=new EdgeDriver();
		driver.get("https://www.redbus.com");
		driver.quit();
		driver.close();
		

	}

}
