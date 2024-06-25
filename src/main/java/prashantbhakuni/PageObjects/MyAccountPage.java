package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[title='TheTestingAcademy eCommerce']")
	private WebElement homeBtn;
	
	public HomePage gotoHomePage() {
		homeBtn.click();
		HomePage homepage = new HomePage(driver);
		return homepage;
	}

}
