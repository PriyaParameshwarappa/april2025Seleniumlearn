package april2025Selenium_day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {

		// Requirement :: capature all the links on any page and
		// print the text of each link

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String tit = driver.getTitle();
		System.out.println(tit);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		//index Based forloop 
		int count = 0;
		for (int i = 0; i < countoflinks; i++) {
			String nameoflink = links.get(i).getText();
			if (nameoflink.length() != 0) {
				System.out.println(i + "=" + nameoflink);
				count++;
			}
		}
		System.out.println("Total number of links in the page=" + countoflinks);
		System.out.println("Number of text available links =" + count);
		System.out.println("Number of the nontext links=" + (countoflinks - count));
		
		//Advance loop 
		
		System.out.println("===========");
		int count1=0;
		for(WebElement e:links) {
			String text=e.getText();
			if(text.length()!=0) {
				System.out.println(count1 + "=" +text);
			}
			count1++;
		}
		

		driver.quit();

	}

}
