package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.Attribute -> Id :: will be always unique 
		driver.findElement(By.id("input-firstname")).sendKeys("Aadhya");
		driver.findElement(By.id("input-lastname")).sendKeys("Deepak");
		
		//2.Attribute-> Name :: not a unique field
		driver.findElement(By.name("email")).sendKeys("Aadhya.Deepak@gmail.com");
		
		//3. Attribute-> class :: not the unique field
		driver.findElement(By.className("form-control")).sendKeys("Aadhya.Deepak@gmail.com");
		
		//4.Attribute -> xpath 
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Deepak");
		
		//5.Attribute -> CSS
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Anu");
		
		
		//6.Attribute ->>linkText
		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7.Attribute ->>PartiallinkText
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//8.Attribute-->>TagName ->>It uses HTML tag 
		String text=driver.findElement(By.tagName("By creating an account you will be able to shop faster, be up to date on an order's status, .")).getText();
		
		
		
		
		
		
		
		
	}

}
