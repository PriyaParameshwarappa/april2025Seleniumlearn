package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil broutil=new BrowserUtil();
		WebDriver driver=broutil.initDriver("chrome");
		broutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title =broutil.getPageTitle();
		System.out.println(title);
		
		 By email=By.id("input-email"); 
		 By password=By.id("input-password");
		 
		 ElementUtil eleUtil=new ElementUtil(driver);
		 eleUtil.doSendKeys(email, "Priya.konemane@gmail.com");
		 eleUtil.doSendKeys(password, "Test123");
		 
		 broutil.quitBrowser();
		 
		 
		  
		  

	}

}
