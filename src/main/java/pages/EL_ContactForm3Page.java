package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EL_ContactForm3Page {
	WebDriver driver;
	public EL_ContactForm3Page(WebDriver driver) {
		this.driver=driver;
	}
	private static final String Login_Success_Text="Your form has been submitted successfully. Thank you!!";
	public void clickPracticeForm() {
	WebElement form = driver.findElement(By.linkText("Practice Forms"));
	form.click();
	}
	//click on practice form link
	
	public void provideUsername() {
	WebElement loginUsername = driver.findElement(By.id("log"));
	loginUsername.sendKeys("dccbaaa");
	}
	//provide username
	
	public void providePassword() {
	WebElement loginPassword = driver.findElement(By.id("pwd"));
	loginPassword.sendKeys("dcba@dcba");
	}
	//provide password
	
	public void clickSubmitBtn() {
	WebElement loginSubmit = driver.findElement(By.name("submit"));
	loginSubmit.click();
	//click on submit btn
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
	}
	}
	
	public void clickPracticeForm3() {
	WebElement practiceForm3 = driver.findElement(By.xpath("(//i[@class='fas fa-file-alt'])[3]"));
	practiceForm3.click();
	}
	//click on practice form 3
	public void provideFirstname() {
	WebElement firstName = driver.findElement(By.cssSelector("[placeholder='First Name']"));
	firstName.sendKeys("Ankush");
	}
	//provide first name
	
	public void provideLastname() {
	WebElement lastName = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
	lastName.sendKeys("Kumar");
	}
	//provide last name
	
	public void provideEmail() {
	WebElement email = driver.findElement(By.cssSelector("[placeholder='Email']"));
	email.sendKeys("ankushkumar@abc.com");
	}
	//provide email
	
	public void providePhone() {
	WebElement phone = driver.findElement(By.cssSelector("[placeholder='Phone']"));
	phone.sendKeys("8844775561");
	}
	//provide phone
	
	public void selectSEODropdown() {
	WebElement selectTag = driver.findElement(By.id("input_3_7"));
	Select dropdown = new Select(selectTag);
	dropdown.selectByVisibleText("SEO");
	}
	//select SEO from dropdown
	
	public void selectByPhone() {
	WebElement byPhone = driver.findElement(By.cssSelector("[value='By Phone']"));
	byPhone.click();
	}
	//select By Phone
	
	public void selectMonth() {
	WebElement month = driver.findElement(By.xpath("(//input[@placeholder='MM'])[1]"));
	month.sendKeys("12");
	}
	//select month
	
	public void selectDate() {
	WebElement date = driver.findElement(By.cssSelector("[placeholder='DD']"));
	date.sendKeys("26");
	}
	//select date
	
	public void selectYear() {
	WebElement year = driver.findElement(By.cssSelector("[placeholder='YYYY']"));
	year.sendKeys("2000");
	}
	//select year
	
	public void selectHour() {
	WebElement hour = driver.findElement(By.cssSelector("[placeholder='HH']"));
	hour.sendKeys("12");
	}
	//select hour
	
	public void selectMinutes() {
	WebElement minutes = driver.findElement(By.xpath("(//input[@placeholder='MM'])[2]"));
	minutes.sendKeys("23");
	}
	//select minutes
	
	public void selectPMDropdown() {
	WebElement selectTag2 = driver.findElement(By.id("input_3_10_3"));
	Select dropdown2 = new Select(selectTag2);
	dropdown2.selectByVisibleText("PM");
	}
	//select pm from dropdown
	
	public void provideStreetAddress() {
	WebElement streetAddress = driver.findElement(By.cssSelector("[placeholder='Street Address']"));
	streetAddress.sendKeys("#1234");
	}
	//provide street address
	
	public void provideCity() {
	WebElement city = driver.findElement(By.cssSelector("[placeholder='City']"));
	city.sendKeys("Chandigarh");
	}
	//provide city
	
	public void provideState() {
	WebElement state = driver.findElement(By.cssSelector("[placeholder='State']"));
	state.sendKeys("Chandigarh");
	}
	//provide state
	
	public void provideZIP() {
	WebElement zip = driver.findElement(By.cssSelector("[placeholder='ZIP']"));
	zip.sendKeys("160101");
	}
	//provide zip
	
	public void selectIndiaDropdown() {
	WebElement selectTag3 = driver.findElement(By.id("input_3_11_6"));
	Select dropdown3 = new Select(selectTag3);
	dropdown3.selectByVisibleText("India");
	}
	//select India from dropdown
	
	public void provideMessage() {
	WebElement message = driver.findElement(By.cssSelector("[placeholder='Your message']"));
	message.sendKeys("write a message");
	}
	//provide message
	
	public void clickSubmitButton() {
	WebElement submitBtn = driver.findElement(By.cssSelector("[value='Submit']"));
	submitBtn.click();
	//click on submit button
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
	}
	}
	
	public void assertLoginMsg() {
	WebElement loginMsg=driver.findElement(By.xpath("//div[@class='the_content_wrapper ']/div[2]/div"));
	String actualText=loginMsg.getText();
	Assert.assertEquals(actualText, Login_Success_Text);
	System.out.println(actualText);
	}
}
