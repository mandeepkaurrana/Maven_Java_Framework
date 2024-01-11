package drivefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {

	//Initially Driver will have default value that is null
	public static WebDriver driver;
	
	public void launchBrowserAndWebSite() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.encapsulatelogics.com");
		}
	}

	//Singleton Design Pattern
	public WebDriver getWebDriver() {
		if (driver == null)
		{
			launchBrowserAndWebSite();
		}
		return driver;
	}

	public void closeBrowser() {
		if (null != driver) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
}

