package prashantbhakuni.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsComponents {
	
	WebDriver driver;
	public PageObjectsComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	protected String firstName = "Prashant";
	protected String lastName = "Bhakuni";
	protected String email = "prashant.bhakuni@random.com";
	protected String telephone = "0987654321";
	protected String password = "ThisIsPassword";
	protected String productName = "iPhone";
	protected String address1 = "Whitefield, Near ITPL";
	protected static String cityName = "Bangalore";
	protected String postCode = "000000";
	protected static String countryName = "India";
	protected String stateName = "Karnataka";
	protected final String yearNum = "2024";
	protected final String monthNum = "7";
	protected final String dateNum = "20";
	protected final String hoursNum = "10";
	protected final String minutesNum = "00";
	
	public void waitForWebElementToAppear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
}
