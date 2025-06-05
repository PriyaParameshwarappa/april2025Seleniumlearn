package april2025Selenium_day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNumberImage {
//Find the Number of images in flipkart page and get the attribute of the image
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> image = driver.findElements(By.tagName("img"));
		int totalnumberofimage = image.size();
		System.out.println("Number of the images =" + totalnumberofimage);
			int count=0;
		for (WebElement e : image) {
			String atbuteofimages = e.getDomAttribute("src");
			System.out.println(count  + "=" + atbuteofimages);
			count++;

		}

		driver.quit();

	}

}
