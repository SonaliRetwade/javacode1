package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy (xpath="//input[@aria-label='Phone number, username, or email']")
	private WebElement useName;
	
	@FindBy (xpath="//input[@aria-label='Password']")
	private WebElement  password ;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[text()='Log in with Facebook']")
	private WebElement adaccount;
	
	//initilization constructor call
	
		public Loginpage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//use
		public void logininstagram()
		{
			useName.sendKeys("sonal");
			 password.sendKeys("34569");
			 loginbutton.click();
			 adaccount.click();

		}
		
		
}
