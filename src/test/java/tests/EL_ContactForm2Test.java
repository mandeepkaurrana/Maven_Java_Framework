package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.EL_ContactForm2Page;

public class EL_ContactForm2Test 
{
	public void contactForm2()
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://encapsulatelogics.com/");
	
	driver.manage().window().maximize();
	EL_ContactForm2Page contactform2page= new EL_ContactForm2Page(driver);
	contactform2page.clickPracticeFormLink();
	contactform2page.enterUsername();
	contactform2page.enterPassword();
	contactform2page.clickLoginButton();
	contactform2page.clickContactForm2Button();
	contactform2page.enterFirstname();
	contactform2page.enterLastname();
	contactform2page.enterPhonenumber();
	contactform2page.enterEmail();
	contactform2page.enterSubject();
	contactform2page.clickGender();
	contactform2page.clickHobbies();
	contactform2page.enterMessage();
	contactform2page.clickSubmit();
	contactform2page.confirmMessage();
	driver.close();
}
}