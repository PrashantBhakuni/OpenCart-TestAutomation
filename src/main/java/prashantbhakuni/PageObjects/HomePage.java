package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import prashantbhakuni.AbstractComponents.PageObjectsComponents;

public class HomePage extends PageObjectsComponents{
	
	 private WebDriver driver;
	 private ProductDetailsPage productdetailspage;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement macBook;
	
	public ProductDetailsPage buyMacBook() {
		macBook.click();
		productdetailspage = new ProductDetailsPage(driver);
		return productdetailspage;
	}
	
	@FindBy(xpath="//a[contains(text(),'iPhone')]")
	private WebElement iPhone;
	
	public String getiPhoneTitle() {
		return iPhone.getText();
	}
	
	public ProductDetailsPage buyIphone() {
		iPhone.click();
		productdetailspage = new ProductDetailsPage(driver);
		return productdetailspage;
	}
	
	@FindBy(xpath="//a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement appleCinema;
	

	public String getCanonCameraTitle() {
		return appleCinema.getText();
	}
	
	public ProductDetailsPage buyCanonCamera() {
		appleCinema.click();
		productdetailspage = new ProductDetailsPage(driver);
		return productdetailspage;
	}
	
	@FindBy(css="input[type='text']")
	private WebElement searchBar;
	
	@FindBy(css="div[id='search'] .btn")
	private WebElement searchBtn;
	
	@FindBy(xpath="//a[contains(text(),'Galaxy')]")
	private WebElement samsungTab;
	
	public void searchSamsungProducts() {
		searchBar.sendKeys("samsung");
		searchBtn.click();
	}
	
	public String getSamsungTabTitle() {
		return samsungTab.getText();
	}
	
	public ProductDetailsPage buySamsungTab() {
		samsungTab.click();
		productdetailspage = new ProductDetailsPage(driver);
		return productdetailspage;
	}
	
	@FindBy(xpath="//a[text()='MP3 Players']")
	private WebElement mp3PlayersCategory;
	
	@FindBy(xpath="//a[text()='Show All MP3 Players']")
	private WebElement showAllOptions;
	
	@FindBy(xpath="//div[@class='caption']//a[contains(text(),'iPod Classic')]")
	private WebElement iPodClassic;
	
	@FindBy(xpath="//h2[text()='MP3 Players']")
	private WebElement categoryTitle;
	
	public void searchByCategory() throws InterruptedException {
		mp3PlayersCategory.click();
		Thread.sleep(1000);
		showAllOptions.click();
	}
	
	public String getCategoryTitle() {
		return categoryTitle.getText();
	}
	
	

//	@FindBy(xpath="(//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
//	private WebElement addMacBookToCart;
//	
//	@FindBy(xpath="//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]")
//	private WebElement addiPhoneToCart;
//	
//	
//	public void addProductsToCart() {
//		addMacBookToCart.click();
//		addiPhoneToCart.click();
//	}
	
	
	
	
	
}
