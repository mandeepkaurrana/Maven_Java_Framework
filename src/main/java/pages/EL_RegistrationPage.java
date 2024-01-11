package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EL_RegistrationPage 
{
	WebDriver driver;
	public EL_RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickPracticeFormLink()
	{
	 WebElement practiceform =driver.findElement(By.linkText("Practice Forms"));
	   practiceform.click();
	}
	
	 public void clickRegisternow()
	 { 
	   WebElement register= driver.findElement(By.partialLinkText("Register now."));
		   register.click();
	 }
	 public void enterUserName(String usertext)
	 {
	   WebElement username= driver.findElement(By.id("user_login"));
	   username.sendKeys(usertext);
	 }
	 public void enterEmail(String emailtext)
	 {
	   
	   WebElement email= driver.findElement(By.id("user_email"));
	   email.sendKeys(emailtext);
	 }
	 public void enterPassword(String passwordtext)
	 {
	   WebElement password= driver.findElement(By.id("user_pass"));
	   password.sendKeys(passwordtext);
	 }
	 public void enterConfirmPAssword(String passwordtext)
	 {
	   WebElement confirmpassword= driver.findElement(By.id("user_confirm_password"));
	   confirmpassword.sendKeys(passwordtext);
	 }
	 public void clickSubmit()
	 {
	   WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
	   submit.click();
	 }
}
