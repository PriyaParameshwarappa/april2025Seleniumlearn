package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementTextTest {

	public static void main(String[] args) {
		BrowserUtil broutil=new BrowserUtil();
		WebDriver driver=broutil.initDriver("chrome");
		broutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header=By.tagName("h2");
		By RegAccText=By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgotPwd=By.linkText("Forgotten Password");
		By footerHeader=By.tagName("h5");
		
		
		ElementUtil elUt=new ElementUtil(driver);
		String m1=elUt.doGetElementText(header);
		String m2=elUt.doGetElementText(RegAccText);
		String m3=elUt.doGetElementText(forgotPwd);
		String m4=elUt.doGetElementText(footerHeader);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		
		
		
		
		
		

	}

}
