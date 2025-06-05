package april2025Selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	public void doSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetElementText(By locator) {
		String eleText = getElement(locator).getText();
		if (eleText != null) {
			return eleText;
		} else {
			System.out.println("Element text is null:" + eleText);
			return null;
		}

	}

	public boolean isElementDispalyed(By locator) {
		try {

			return getElement(locator).isDisplayed();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed:" + locator);
			return false;
		}
	}
	
	
	public boolean isElementEnabled(By locator) {
		try {

			return getElement(locator).isEnabled();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not enabled:" + locator);
			return false;
		}
	}

	
	public boolean isElementSelected(By locator) {
		try {

			return getElement(locator).isSelected();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not selected:" + locator);
			return false;
		}}
		

	public String doElementGetAttribute(By locator,String attValue) {
		return getElement(locator).getAttribute(attValue);
		
	}
		
	


}
