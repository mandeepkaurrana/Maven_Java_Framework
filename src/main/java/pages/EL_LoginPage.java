package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EL_LoginPage {
	
	WebDriver driver;
	public EL_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickPracticeFormLink() {
		WebElement we=driver.findElement(By.linkText("Practice Forms"));
		we.click();
	}
	
	public void enterUsername() {
		WebElement usertextbox=driver.findElement(By.id("log"));
		usertextbox.sendKeys("adminmk");
	}
	
	public void enterpassword()
	{
	WebElement passwordbox=driver.findElement(By.id("pwd"));
	passwordbox.sendKeys("code");
	}
	
	public void clickLoginButton()
	{
		WebElement loginbutton=driver.findElement(By.name("submit"));
		loginbutton.click();
	}
	
}
