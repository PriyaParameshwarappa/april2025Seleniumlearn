package april2025Selenium_day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAlltheLinksAndTextandHrefValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totLinks = links.size();
		System.out.println(totLinks);
		int count = 0;

		for (WebElement e : links) {
			String eleText = e.getText();
			String eleAttribute = e.getDomAttribute("href");
			System.out.println(count + "=" + eleText + "::"+ eleAttribute);
			count++;
		}

	}

}
