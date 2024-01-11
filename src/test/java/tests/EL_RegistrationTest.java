package tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import drivefactory.WebBrowser;
import pages.EL_RegistrationPage;
import readers.PropertyFileReader;

public class EL_RegistrationTest
{
	
	@Test
	public void RegisterToEncapsulateLogics()
	{
	   WebDriver driver=WebBrowser.getWebDriver("chrome");
		
	   Properties prop=PropertyFileReader.getTestData("registerdata");
	   
	   String rs=utilities.RandomGenerator.getRandomString();
	   EL_RegistrationPage registrationPage = new EL_RegistrationPage(driver);
	   registrationPage.clickPracticeFormLink();
	   registrationPage.clickRegisternow();
	   registrationPage.enterUserName(prop.getProperty("username")+rs);
	   registrationPage.enterEmail(prop.getProperty("useremail")+"@"+rs+".com");
	   registrationPage.enterPassword(prop.getProperty("password"));
	   registrationPage.enterConfirmPAssword(prop.getProperty("cpassword"));
	   registrationPage.clickSubmit();
	   driver.close();
	}
}
