package drivefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {

	public static WebDriver getWebDriver(String browser) {
		
		
		WebDriver driver=null;
		switch(browser.toLowerCase().trim())
		{
		case "chrome":
		   driver= new ChromeDriver();
		   driver.get("https://encapsulatelogics.com");
		   
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().deleteAllCookies();
		   break;
		case "firefox":
		   driver= new FirefoxDriver();
		   driver.get("https://encapsulatelogics.com");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().deleteAllCookies();
		}
	  return driver;
	}
	
	
}
