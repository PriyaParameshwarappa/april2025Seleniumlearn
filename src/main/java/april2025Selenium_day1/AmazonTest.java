package april2025Selenium_day1;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https:\\www.amazon.com");
		String title=brUtil.getPageTitle();
		System.out.println(title);
		if(title.contains("Amazon.com")) {
			System.out.println("TestCase Pass");
		}else {
			System.out.println("TestCase Fail");
		} 
		String pageUrl=brUtil.getPageURL();
		System.out.println(pageUrl);
		
		brUtil.quitBrowser();
			
		
		
		
		

	}

}
