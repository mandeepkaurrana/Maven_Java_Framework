package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.EL_ContactForm1Page;

public class EL_ContactForm1Test 
{
	@Test
	public void contactForm1()
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://encapsulatelogics.com/");
	
	driver.manage().window().maximize();
	
	EL_ContactForm1Page contactform1page= new EL_ContactForm1Page(driver);
	contactform1page.clickPracticeFormLink();
	contactform1page.enterUsername();
	contactform1page.enterPassword();
	contactform1page.clickLoginButton();
	contactform1page.clickContactForm1Button();
	contactform1page.enterFirstname();
	contactform1page.enterLastname();
	contactform1page.enterPhonenumber();
	contactform1page.enterEmail();
	contactform1page.enterSubject();
	contactform1page.enterMessage();
	contactform1page.clickSubmit();
	contactform1page.confirmMessage();
	driver.close();
}
}
