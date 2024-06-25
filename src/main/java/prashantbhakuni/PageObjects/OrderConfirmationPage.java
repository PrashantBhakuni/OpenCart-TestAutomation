package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	
	WebDriver driver;

	public OrderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Your order has been placed!')]")
	private WebElement orderConfirmationText;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement continueBtn;
	
	public String getOrderConfirmation() {
		return orderConfirmationText.getText();
	}

}
