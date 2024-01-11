package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.EL_LoginPage;

//Page Object Model - Design Principle for Automation framework
//In which we segregated page classes and test classes
//methods in page classes will locate the web elements and perform action on the elements
//methods in test classes will integrate with Page classes and 
//invoke the page class methods as per the given test steps

//Separate Page class for each web page


public class EL_LoginTest {
	@Test
	public void loginToEncapsulateLogics() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.encapsulatelogics.com");
		
		EL_LoginPage loginPage=new EL_LoginPage(driver);
		
		loginPage.clickPracticeFormLink();
		loginPage.enterUsername();
		loginPage.enterpassword();
		loginPage.clickLoginButton();
	
	}
}
