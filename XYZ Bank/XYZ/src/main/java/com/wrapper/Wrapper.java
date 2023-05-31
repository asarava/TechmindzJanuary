package com.wrapper;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.base.TestBase;

public class Wrapper extends TestBase
{
		public void waitForElement(WebElement pElement) 
	{
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(pElement));
	}
		public void waitForAlert()
		{
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		}
		public void alertAccept() 
		{
		Alert alert = driver.switchTo().alert();
		alert.accept(); 
		}

	// Select By Value
		public void selectByValue(WebElement pElement, String pValue) {

			Select selector = new Select(pElement);
			selector.selectByValue(pValue);
		}
		
		public void selectByIndex(WebElement pElement, int pValue) {

			Select selector = new Select(pElement);
			selector.selectByIndex(pValue);
		}

		// Select By Visible Text
		public void selectByVisibleText(WebElement element, String pValue) {
			Select selector = new Select(element);
			selector.selectByVisibleText(pValue);
		}

		// Move to an Element
		public void moveToElement(WebDriver driver, WebElement element) {

			Actions builder = new Actions(driver);
			Action contextClickElement = builder.moveToElement(element).contextClick().build();
			contextClickElement.perform();
		}

		// Select an Element -- UL/LI Selector
		public List<WebElement> selectElement(WebDriver driver, WebElement pSelectElement, String pDropDownElementPath) 
		{

			pSelectElement.click();
			List<WebElement> pDropDownElement = driver.findElements(By.xpath(pDropDownElementPath));
			return pDropDownElement;
		}
				
		// Context Click or Right Click

		// Window-Tabs Handle
		public void windowHandle(WebDriver driver) throws InterruptedException 
		{

			// To get the current window handle.
			String currentWindow = driver.getWindowHandle();
			// To get all window handles.
			Set<String> allWindows = driver.getWindowHandles();
			for (String temp : allWindows) {
				driver.switchTo().window(temp);
				Thread.sleep(5000);
			}
			driver.switchTo().window(currentWindow);
		}

		public void iFrameHandler(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}
		
		
		public String getAlertText()
		{
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			return alert.getText();
		}
}
