package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementedIsDisplayedAndIsEnablded{

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		boolean elecheck=driver.findElement(By.id("fname")).isDisplayed();
		Thread.sleep(1000);
		System.out.println(elecheck);
		
		//Verifying the element is enableded  using isEnablded();
		
		boolean eleEnabd=driver.findElement(By.id("fname")).isEnabled();
		Thread.sleep(1000);
		System.out.println(eleEnabd);
		
		boolean eleEnabdPas=driver.findElement(By.id("pass")).isEnabled();
		Thread.sleep(1000);
		System.out.println(eleEnabdPas);
		
	
		
		
		
		
		
	}

}
