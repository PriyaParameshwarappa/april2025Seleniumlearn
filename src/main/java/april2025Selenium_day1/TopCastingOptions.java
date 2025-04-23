package april2025Selenium_day1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
	// Option1:valid
		ChromeDriver c=new ChromeDriver();
		
		// Option2 ::valid
		WebDriver d=new ChromeDriver();
		
		// Option 3::We will use it when we want to run code on Remote machine like Selenium GRID
		//WebDriver r=new RemoteWebDriver(null, null);
		
		// Option 4 :: valid
		
		SearchContext s=new ChromeDriver();
		
		// option 5:: valid
		
		RemoteWebDriver r=new ChromeDriver();
		
		//option 6::valid
		
		ChromiumDriver c1=new ChromeDriver();
		
		// option 7:: valid 
		
		//SearchContext s=new RemoteWebDriver(null, null);
		
	// Most Recommened used in industory is 	
		//---WebDriver d=new ChromeDriver();
		//---WebDriver r=new RemoteWebDriver(null, null);
		
		

	}

}
