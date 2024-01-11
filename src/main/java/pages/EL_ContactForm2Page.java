package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EL_ContactForm2Page 
{
	WebDriver driver;
	public EL_ContactForm2Page(WebDriver driver)
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
	public void clickContactForm2Button()
	{
	  WebElement contactform2= driver.findElement(By.xpath("//h4[text()='Contact Form 2']"));
	  contactform2.click();
	} 
	public void enterFirstname()
	{
	  WebElement contactform2firstname= driver.findElement(By.cssSelector("*[placeholder='First Name']"));
	  contactform2firstname.sendKeys("nehaForm2");
	}
	public void enterLastname()
	{
	  WebElement contactform2lastname= driver.findElement(By.cssSelector("*[placeholder='Last Name']"));
	  contactform2lastname.sendKeys("nehaForm2");
	}
	public void enterPhonenumber()
	{
	  By placeholder= By.cssSelector("*[placeholder='Phone']");

	  
	  WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	  w.until(ExpectedConditions.visibilityOfElementLocated(placeholder));
	  
	  WebElement contactform1phone= driver.findElement(placeholder);
	  String a= "(111)111-1111";
	  contactform1phone.sendKeys(String.valueOf(a));
	}
	
	public void enterEmail()
	{
	  WebElement contactform2Email= driver.findElement(By.cssSelector("*[placeholder='Email']"));
	  contactform2Email.sendKeys("nehaForm2@gmail.com");
	}
	public void enterSubject()
	{
	  WebElement contactform2Subject= driver.findElement(By.cssSelector("*[placeholder='Subject']"));
	  contactform2Subject.sendKeys("Computer");
	}
	public void clickGender()
	{
	  WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
	  gender.click();
	}
	public void clickHobbies()
	{
	  WebElement hobbies1= driver.findElement(By.xpath("//label[text()='Listen Music']"));
	  hobbies1.click();
	 
	  WebElement hobbies2= driver.findElement(By.xpath("//label[text()='Reading']"));
	  hobbies2.click();
	}
	public void enterMessage()
	{
	  
	  WebElement contactform2Message= driver.findElement(By.cssSelector("*[placeholder='Your message']"));
	  contactform2Message.sendKeys("Automated Contact Form2 From Practice Forms");
	}
	public void clickSubmit()
	{
	  WebElement contactform2Submit= driver.findElement(By.cssSelector("input[value='Submit']"));
	  contactform2Submit.click();
	}
	public void confirmMessage()
	{
	  
	  By confirmlocator= By.xpath("//*[@class='section_wrapper']/div/div/div");
	 
	  WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	  w1.until(ExpectedConditions.visibilityOfElementLocated(confirmlocator));
	  
	  WebElement confirm= driver.findElement(confirmlocator);
	  System.out.println(confirm.getText()); 
}
}
