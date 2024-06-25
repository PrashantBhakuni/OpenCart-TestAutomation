package prashantbhakuni.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prashantbhakuni.AbstractComponents.PageObjectsComponents;

public class ProductDetailsPage extends PageObjectsComponents {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	private WebElement confirmProductTitle;

	@FindBy(id = "button-cart")
	private WebElement addToCart;

	@FindBy(xpath = "//div[@class='radio'][2]/label/input")
	private WebElement radioMedium;

	@FindBy(css = ".checkbox:Nth-child(2) label input")
	private WebElement checkBox2;

	@FindBy(css = ".checkbox:Nth-child(3) label input")
	private WebElement checkBox3;

	@FindBy(xpath = "//option")
	private List<WebElement> selectOptions;

	@FindBy(id = "input-option209")
	private WebElement textArea;

	@FindBy(id = "button-upload222")
	private WebElement uploadFile;

	@FindBy(xpath = "//div[text()='File required!']")
	private WebElement uploadErrorMsg;

	@FindBy(css = ".datetime button")
	private WebElement dateTimeBtn;

	@FindBy(xpath = "//li[@class='collapse in']//th[@class='picker-switch'][normalize-space()='February 2011']")
	private WebElement monthsList;

	@FindBy(xpath = "//li[@class='collapse in']//th[@class='picker-switch'][normalize-space()='2011']")
	private WebElement yearsList;

	@FindBy(xpath = "//li[@class='collapse in']//div[@class='datepicker-years']//th[@class='next'][contains(text(),'›')]")
	private WebElement nextPage;

	@FindBy(xpath = "//span[contains(text(),'" + yearNum + "')]")
	private WebElement selcetYear;

	@FindBy(xpath = "//body[1]/div[4]/ul[1]/li[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[" + monthNum + "]")
	private WebElement selectMonth;

	@FindBy(xpath = "//td[@class='day'][normalize-space()='" + dateNum + "']")
	private WebElement selectDate;

	@FindBy(css = ".usetwentyfour ul li:nth-child(2) a")
	private WebElement selectTime;

	@FindBy(xpath = "//body[1]/div[4]/ul[1]/li[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/span[1]")
	private WebElement gotoHours;

	@FindBy(xpath = "//body[1]/div[4]/ul[1]/li[3]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[text()='" + hoursNum + "']")
	private WebElement selectHours;

	@FindBy(xpath = "//body[1]/div[4]/ul[1]/li[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/span[1]")
	private WebElement gotoMinutes;

	@FindBy(xpath = "//body[1]/div[4]/ul[1]/li[3]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[text()='" + minutesNum
			+ "']")
	private WebElement selectMinutes;

	public String confirmProductTitle() {
		return confirmProductTitle.getText();
	}

	public void selectAvailableOptions() {
		radioMedium.click();
		checkBox2.click();
		checkBox3.click();
		selectOptions.stream().filter(s -> s.getText().contains("Blue")).findFirst().get().click();
		textArea.sendKeys("No Comments");
		dateTimeBtn.click();
		monthsList.click();
		yearsList.click();
		nextPage.click();
		selcetYear.click();
		selectMonth.click();
		selectDate.click();
		selectTime.click();
		gotoHours.click();
		selectHours.click();
		gotoMinutes.click();
		selectMinutes.click();

	}

	public int addToCart() {
		int i = 0;
		addToCart.click();
		return i++;
	}

	public String getUploadErrorMsg() {
		return uploadErrorMsg.getText();
	}

}
