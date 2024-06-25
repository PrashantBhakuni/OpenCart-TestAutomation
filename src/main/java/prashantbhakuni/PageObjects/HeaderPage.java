package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prashantbhakuni.AbstractComponents.PageObjectsComponents;

public class HeaderPage extends PageObjectsComponents{
	// UserName1@opencart.com
	// P@55word
	WebDriver driver;

	public HeaderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccountBtn;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerOption;

	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginOption;
	
	@FindBy(css=".breadcrumb li:nth-child(1) a")
	private WebElement homePage;
	
	@FindBy(xpath="//a[@title='Shopping Cart']")
	private WebElement shoppintCartOption;
	
	public RegistrationPage gotoRegistrationPage() {
		myAccountBtn.click();
		registerOption.click();
		RegistrationPage registrationpage = new RegistrationPage(driver);
		return registrationpage;
	}
	
	public LoginPage gotoLoginPage() {
		myAccountBtn.click();
		loginOption.click();
		LoginPage loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	public ShoppingCartPage gotoCartPage() {
		shoppintCartOption.click();
		ShoppingCartPage shoppingcartpage = new ShoppingCartPage(driver);
		return shoppingcartpage;
	}
	
}
