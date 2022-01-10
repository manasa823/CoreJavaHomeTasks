package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchBaseURL(String url) 
	{
		driver.get(url);
		System.out.println("Loaded URL : "+url);
		waitforPageLoad();
	}
	
	public void addExplicitWait(WebElement element,int inttimeoutinseconds)
	{

		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(inttimeoutinseconds));
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Driver waits explicitly until the element "+element+" is visible");
	}
	
	public void click(WebElement element)  
	{
			element.click();
			System.out.println("The element "+element+" is clicked");
	}
	
	public void waitforPageLoad()
	{
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

			    wait.until(new ExpectedCondition<Boolean>() {
			        public Boolean apply(WebDriver wdriver) {
			        	boolean result= ((JavascriptExecutor)driver).executeScript(
				                "return document.readyState").equals("complete");
			        	return result;
			        }
			    });
	}
	
	public void type(WebElement element, String value)
	{
		   element.sendKeys(value);
		   System.out.println("String " + value + " is send to element "+ element);
	}
	
	public void selectDropDownByValue(WebElement element, String value)
	{
		Select dropDown = new Select(element);
		dropDown.selectByValue(value);
		System.out.println("The dropdown option with value " + value
					+ " is selected");
	} 
	
	public void selectDropDownByIndex(WebElement element, int index)
	{
		Select dropDown = new Select(element);
		dropDown.selectByIndex(index);
		System.out.println("The dropdown option with index " + index
					+ " is selected");
	} 
	
	public void selectDropDownByText(WebElement element, String text)
	{
		Select dropDown = new Select(element);
		dropDown.selectByVisibleText(text);
		System.out.println("The dropdown option with text " + text
					+ " is selected");
	} 
	
	public void mouseHover(WebElement element) 
	{
		new Actions(driver).moveToElement(element).build().perform();
		System.out.println("Mouse hover is performed on element "+ element);
	}
	
	public void switchToWindow() 
	{
			for (String windowHandle : driver.getWindowHandles()) 
			{
				driver.switchTo().window(windowHandle);
			}
			System.out.println("Switched to Window");
	} 
	
	public void switchToFrameByIndex(int index) {
		
		driver.switchTo().frame(index);
		System.out.println("The driver is switched into frame");
	}
	
	public void switchToFrameByName(String name) {
		
		driver.switchTo().frame(name);
		System.out.println("The driver is switched into frame");
	}
	
	public void switchToFrameByWebElement(WebElement element) {
		
		driver.switchTo().frame(element);
		System.out.println("The driver is switched into frame");
	}
	
	public void clickUsingJavascriptExecutor(WebElement element)
	{
		System.out.println(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		System.out.println("The element "+element+" is clicked");
	}
	
	public void scrollToElementUsingJavascriptExecutor(WebElement element)
	{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",element);
			System.out.println("Browser window is scrolled to element "+element);	
	}
	
	public boolean isElementVisible(WebElement element)
	{
			boolean bool = element.isDisplayed();
			if (bool==true)
				System.out.println("The element "+ element+ " is visible");
			return bool;
	}
	
}
