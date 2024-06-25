package prashantbhakuni.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prashantbhakuni.AbstractComponents.PageObjectsComponents;

public class CheckoutPage extends PageObjectsComponents{
	
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[value='guest']")
	private WebElement guestCheckoutRadio;
	
	@FindBy(id="button-account")
	private WebElement continueToBillingDetails;

	public void guestCheckout() throws InterruptedException {
		guestCheckoutRadio.click();
		Thread.sleep(1000);
		continueToBillingDetails.click();
	}
	
	@FindBy(id="input-payment-firstname")
	private WebElement inputFirstName;
	
	@FindBy(id="input-payment-lastname")
	private WebElement inputLastName;

	@FindBy(id="input-payment-email")
	private WebElement inputEmail;

	@FindBy(id="input-payment-telephone")
	private WebElement inputTelephone;
	
	@FindBy(id="input-payment-address-1")
	private WebElement inputAddress1;
	
	@FindBy(id="input-payment-city")
	private WebElement city;
	
	@FindBy(id="input-payment-postcode")
	private WebElement inputPostCode;
	
//	@FindBy(id="input-payment-country")
//	private WebElement selectCountry;
	
	@FindBy(css="#input-payment-country option")
	private List<WebElement> countriesList;
	
//	@FindBy(id="input-payment-zone")
//	private WebElement inputState;
	
	@FindBy(css="#input-payment-zone option")
	private List<WebElement> statesList;
	
	@FindBy(id="button-guest")
	private WebElement continueToDeliveryDetails; 
	
	public void billingDetails() throws InterruptedException {
		inputFirstName.sendKeys(firstName);
		inputLastName.sendKeys(lastName);
		inputEmail.sendKeys(email);
		inputTelephone.sendKeys(telephone);
		inputAddress1.sendKeys(address1);
		city.sendKeys(cityName);
		inputPostCode.sendKeys(postCode);
		countriesList.stream().filter(s -> s.getText().equalsIgnoreCase(countryName)).findFirst().get().click();
		Thread.sleep(1000);
		statesList.stream().filter(s->s.getText().equalsIgnoreCase(stateName)).findFirst().get().click();
		continueToDeliveryDetails.click();
	}
	
	@FindBy(id="button-payment-address")
	private WebElement continueToDeliveryDetailsAfterLogin;
	
	public void defaultBillingDetails() {
		continueToDeliveryDetailsAfterLogin.click();
	}
	
	@FindBy(id="button-shipping-address")
	private WebElement continueToDeliveryMethod;
	
	public void deliveryDetails() {
		continueToDeliveryMethod.click();
	}
	
	@FindBy(id="button-shipping-method")
	private WebElement continueToPaymentMethod;
	
	public void deliveryMethod() throws InterruptedException {
		Thread.sleep(1000);
		continueToPaymentMethod.click();
	}
	
	@FindBy(css="input[name='agree']")
	private WebElement agreeTermsRadio;
	
	@FindBy(id="button-payment-method")
	private WebElement continueToConfirmOrder;
	
	public void paymentMethod() throws InterruptedException {
		Thread.sleep(1000);
		agreeTermsRadio.click();
		continueToConfirmOrder.click();
	}
	
	@FindBy(id="button-confirm")
	private WebElement confirmOrderBtn;
	
	public OrderConfirmationPage confirmOrder() {
		confirmOrderBtn.click();
		OrderConfirmationPage orderconfirmationpage = new OrderConfirmationPage(driver);
		return orderconfirmationpage;
	}
	
	
	

}
