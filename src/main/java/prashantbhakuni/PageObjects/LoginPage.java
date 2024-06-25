package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prashantbhakuni.AbstractComponents.PageObjectsComponents;

public class LoginPage extends PageObjectsComponents{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='email']")
	private WebElement enterEmail;
	
	@FindBy(id="input-password")
	private WebElement enterPassword;
	
	@FindBy(css="*[type='submit']")
	private WebElement loginBtn;
	
	public MyAccountPage loginAccount() {
		enterEmail.sendKeys(email);
		enterPassword.sendKeys(password);
		loginBtn.click();
		MyAccountPage myaccountpage = new MyAccountPage(driver);
		return myaccountpage;
	}
}
