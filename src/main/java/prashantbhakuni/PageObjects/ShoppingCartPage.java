package prashantbhakuni.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Checkout')]")
	private WebElement checkoutBtn;

	public CheckoutPage checkoutItem() {
		checkoutBtn.click();
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}

	@FindBy(xpath="//div[@class='table-responsive']/table/tbody/tr")
	private List<WebElement> numOfItemsInCart;
	
	public int countItemsInCart() {
		return numOfItemsInCart.size();
	}
	
	@FindBy(xpath="//div[@class='table-responsive']/table/tbody/tr/td[@class='text-left'][1]")
	private List<WebElement> itemsList;
	
	public boolean isPresent(String itemName) {
		Boolean itemPresent = itemsList.stream().anyMatch(s -> s.getText().equalsIgnoreCase(itemName));
		return itemPresent;
	}
}
