package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EL_ContactForm1Page 
{
	WebDriver driver;
	public EL_ContactForm1Page(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void clickPracticeFormLink()
	 {
	 WebElement practiceform =driver.findElement(By.linkText("Practice Forms"));
		practiceform.click();
	 }
	 public void enterUsername()
	 {
		 WebElement username= driver.findElement(By.id("log"));
		   username.sendKeys("neha1");
	 }
	 public void enterPassword()
	 {
		  WebElement password= driver.findElement(By.id("pwd"));
		  password.sendKeys("java");
	 }
	 public void clickLoginButton()
	 {
		  WebElement login= driver.findElement(By.xpath("//input[@value='Log In']"));
		  login.click();
	 }
	 public void clickContactForm1Button()
	 {
		  WebElement contactform1= driver.findElement(By.xpath("//div[@class='icon_wrapper']/div/i"));
		  contactform1.click();
	 }
	 public void enterFirstname()
	 {
		  WebElement contactform1firstname= driver.findElement(By.cssSelector("*[placeholder='First Name']"));
		  contactform1firstname.sendKeys("nehaForm1");
	 }
	 public void enterLastname()
	 {
		  WebElement contactform1lastname= driver.findElement(By.cssSelector("*[placeholder='Last Name']"));
		  contactform1lastname.sendKeys("nehaForm1");
	 }
	 public void enterPhonenumber()
	 {
		  WebElement contactform1phone= driver.findElement(By.cssSelector("*[placeholder='Phone']"));
		 
		  contactform1phone.sendKeys("(111)111-1111");
		  
		 
	 }  
	 public void enterEmail()
	 {
		  WebElement contactform1Email= driver.findElement(By.cssSelector("*[placeholder='Email']"));
		  contactform1Email.sendKeys("nehaForm1@gmail.com");
	 }
	 public void enterSubject()
	 {
		  WebElement contactform1Subject= driver.findElement(By.cssSelector("*[placeholder='Subject']"));
		  contactform1Subject.sendKeys("Computer");
	 }
	 public void enterMessage()
	 {
		  WebElement contactform1Message= driver.findElement(By.cssSelector("*[placeholder='Your message']"));
		  contactform1Message.sendKeys("Automated Contact Form1 From Practice Forms");
	 }
	 public void clickSubmit()
	 {
		  WebElement contactform1Submit= driver.findElement(By.cssSelector("input[value='Submit']"));
		  contactform1Submit.click();
	 }
	 
	 public void confirmMessage()
	 {
		  
		 By confirmlocator= By.xpath("//*[@class='section_wrapper']/div/div/div");  
			//Explicit Wait
			  
	  WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
	  w.until(ExpectedConditions.visibilityOfElementLocated(confirmlocator));
	  
	  //get the text
	  
			  WebElement confirm= driver.findElement(confirmlocator);
			  System.out.println(confirm.getText());  
	 }
}
