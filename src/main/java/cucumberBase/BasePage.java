package cucumberBase;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private static String chromePath = "C:\\Users\\manasa.channamaraju\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	
	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver",chromePath);	
		ChromeOptions options = new ChromeOptions();	
		options.addArguments("--start-maximized");	
		options.addArguments("--incognito");
		//options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        return driver;
	}
	
	public void waitforPageLoad()
	{
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  
		  wait.until(new ExpectedCondition<Boolean>() {
			  public Boolean apply(WebDriver wdriver) {
		        	boolean result= ((JavascriptExecutor) driver).executeScript(
			                "return document.readyState"
				            ).equals("complete");
		        	return result;
		        }
		});		    
	}
}