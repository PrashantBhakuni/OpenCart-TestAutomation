package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.HeaderPage;
import prashantbhakuni.PageObjects.RegistrationPage;
import prashantbhakuni.TestComponents.BaseTest;

public class RegisterTest extends BaseTest {

	@Test
	public void performAccountRegistration() {
		HeaderPage header = new HeaderPage(driver);
		RegistrationPage registrationpage = header.gotoRegistrationPage();
		registrationpage.registerAccount();
	}
}
