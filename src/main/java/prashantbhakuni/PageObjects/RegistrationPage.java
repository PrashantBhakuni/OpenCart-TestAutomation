package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prashantbhakuni.AbstractComponents.PageObjectsComponents;

public class RegistrationPage extends PageObjectsComponents{
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement inputFirstName;
	
	@FindBy(id="input-lastname")
	private WebElement inputLastName;

	@FindBy(id="input-email")
	private WebElement inputEmail;

	@FindBy(id="input-telephone")
	private WebElement inputTelephone;
	
	@FindBy(id="input-password")
	private WebElement inputPassword;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;
	
	@FindBy(name="agree")
	private WebElement agreeTermsRadio;
	
	@FindBy(css=".btn-primary")
	private WebElement continueBtn;
	
	public void registerAccount() {
		inputFirstName.sendKeys(firstName);
		inputLastName.sendKeys(lastName);
		inputEmail.sendKeys(email);
		inputTelephone.sendKeys(telephone);
		inputPassword.sendKeys(password);
		confirmPassword.sendKeys(password);
		agreeTermsRadio.click();
		continueBtn.click();
	}

}
