package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.EL_ContactForm3Page;


public class EL_ContactForm3Test {
	
	@Test
	public static void practice3() {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://encapsulatelogics.com");
		
		EL_ContactForm3Page loginPage = new EL_ContactForm3Page(driver);
		loginPage.clickPracticeForm();
		loginPage.provideUsername();
		loginPage.providePassword();
		loginPage.clickSubmitBtn();
		loginPage.clickPracticeForm3();
		loginPage.provideFirstname();
		loginPage.provideLastname();
		loginPage.provideEmail();
		loginPage.providePhone();
		loginPage.selectSEODropdown();
		loginPage.selectByPhone();
		loginPage.selectMonth();
		loginPage.selectDate();
		loginPage.selectYear();
		loginPage.selectHour();
		loginPage.selectMinutes();
		loginPage.selectPMDropdown();
		loginPage.provideStreetAddress();
		loginPage.provideCity();
		loginPage.provideState();
		loginPage.provideZIP();
		loginPage.selectIndiaDropdown();
		loginPage.provideMessage();
		loginPage.clickSubmitButton();
		loginPage.assertLoginMsg();
		
			driver.quit();
	}

}
