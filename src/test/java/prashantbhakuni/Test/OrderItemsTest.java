package prashantbhakuni.Test;

import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.CheckoutPage;
import prashantbhakuni.PageObjects.HeaderPage;
import prashantbhakuni.PageObjects.HomePage;
import prashantbhakuni.PageObjects.LoginPage;
import prashantbhakuni.PageObjects.MyAccountPage;
import prashantbhakuni.PageObjects.OrderConfirmationPage;
import prashantbhakuni.PageObjects.ProductDetailsPage;
import prashantbhakuni.PageObjects.ShoppingCartPage;
import prashantbhakuni.TestComponents.BaseTest;

public class OrderItemsTest extends BaseTest {

	HeaderPage header;

	@Test
	public void orderWithoutRegistration() throws InterruptedException {

		HomePage homepage = new HomePage(driver);
		ProductDetailsPage productdetailspage = homepage.buyIphone();
		Assert.assertEquals(productdetailspage.confirmProductTitle(), homepage.getiPhoneTitle());
		productdetailspage.addToCart();
		HeaderPage header = new HeaderPage(driver);
		ShoppingCartPage shoppingcartpage = header.gotoCartPage();
		CheckoutPage checkoutpage = shoppingcartpage.checkoutItem();
		checkoutpage.guestCheckout();
		checkoutpage.billingDetails();
		checkoutpage.deliveryMethod();
		checkoutpage.paymentMethod();
		OrderConfirmationPage orderconfirmationpage = checkoutpage.confirmOrder();
		Assert.assertEquals(orderconfirmationpage.getOrderConfirmation(), "Your order has been placed!");
	}

//	@Test
//	public void orderAfterRegistration() throws InterruptedException {
//
//		header = new HeaderPage(driver);
//		LoginPage loginpage = header.gotoLoginPage();
//		MyAccountPage myaccountpage = loginpage.loginAccount();
//		HomePage homepage = myaccountpage.gotoHomePage();
//		ProductDetailsPage productdetailspage = homepage.buyMacBook();
//		productdetailspage.addToCart();
//		HeaderPage header = new HeaderPage(driver);
//		ShoppingCartPage shoppingcartpage = header.gotoCartPage();
//		CheckoutPage checkoutpage = shoppingcartpage.checkoutItem();
//		checkoutpage.defaultBillingDetails();
//		checkoutpage.deliveryDetails();
//		checkoutpage.deliveryMethod();
//		checkoutpage.paymentMethod();
//		OrderConfirmationPage orderconfirmationpage = checkoutpage.confirmOrder();
//		Assert.assertEquals(orderconfirmationpage.getOrderConfirmation(), "Your order has been placed!");
//	}

	@Test
	public void orderWithoutUploadFile() {
		header = new HeaderPage(driver);
		LoginPage loginpage = header.gotoLoginPage();
		MyAccountPage myaccountpage = loginpage.loginAccount();
		HomePage homepage = myaccountpage.gotoHomePage();
		ProductDetailsPage productdetailspage = homepage.buyCanonCamera();
		Assert.assertEquals(productdetailspage.confirmProductTitle(), homepage.getCanonCameraTitle());
		productdetailspage.selectAvailableOptions();
		productdetailspage.addToCart();
		Assert.assertEquals(productdetailspage.getUploadErrorMsg(), "File required!");
	}

	@Test
	public void findProductBySearch() {
		header = new HeaderPage(driver);
		LoginPage loginpage = header.gotoLoginPage();
		MyAccountPage myaccountpage = loginpage.loginAccount();
		HomePage homepage = myaccountpage.gotoHomePage();
		homepage.searchSamsungProducts();
		ProductDetailsPage productdetailspage = homepage.buySamsungTab();
		Assert.assertEquals(productdetailspage.confirmProductTitle(), homepage.getSamsungTabTitle());
	}

	@Test
	public void findProductByCategory() throws InterruptedException {
		header = new HeaderPage(driver);
		LoginPage loginpage = header.gotoLoginPage();
		MyAccountPage myaccountpage = loginpage.loginAccount();
		HomePage homepage = myaccountpage.gotoHomePage();
		homepage.searchByCategory();
		Assert.assertEquals(homepage.getCategoryTitle(), "MP3 Players");
	}

	@Test
	public void verifyCartProducts() {
		header = new HeaderPage(driver);
		LoginPage loginpage = header.gotoLoginPage();
		loginpage.loginAccount();
		ShoppingCartPage shoppingcartpage = header.gotoCartPage();
		Assert.assertEquals(shoppingcartpage.countItemsInCart(), 1);
		shoppingcartpage.isPresent("iPhone");

	}
}
