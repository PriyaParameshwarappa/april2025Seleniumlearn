package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil broutil=new BrowserUtil();
		WebDriver driver=broutil.intiBrowser("chrome");
		broutil.browserURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(broutil.getPageTitle());
		
		 By fName=By.id("input-firstname"); 
		 By lName=By.id("input-lastname");
		 By eMail=By.id("input-email");
		 By telNumber=By.id("input-telephone");
		 By pWrd=By.id("input-password");
		 By cWrd=By.id("input-confirm");
		 
		 
		 ElementUtil eu=new ElementUtil(driver);
		 eu.dosendkeys(fName, "Priya");
		 eu.dosendkeys(lName, "Parameshwarappa");
		 eu.dosendkeys(eMail, "Priya.konemane@gmail.com");
		 eu.dosendkeys(telNumber, "7259614993");
		 eu.dosendkeys(pWrd, "Test123");
		 eu.dosendkeys(cWrd, "Test123");
		 
		 System.out.println("All the value entried sucessfully  ");
		 
		 broutil.quitBrowser();
		 
		 
		
		
		
		
		

	}

}
