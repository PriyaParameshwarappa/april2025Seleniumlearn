package SeleniumPractice;

public class NaveenAppTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.intiBrowser("chrome");
		brUtil.browserURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=brUtil.getPageTitle();
		System.out.println(title);
		if(title.contains("Account Login")) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail ");
		}
		
		System.out.println(brUtil.getPageURL());
		
		brUtil.quitBrowser();
		
		
		

	}

}
