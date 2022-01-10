package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	private String chromePath = "C:\\Users\\manasa.channamaraju\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	}
	
	public void launchBaseURL(String url) 
	{
		driver.get(url);
		System.out.println("Loaded URL : "+url);
	}
	
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}

}
