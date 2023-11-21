package techview.sample.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTestPage {
	private LoginPage login;

	@BeforeEach
	public void init() {
		super.init();
		login = new LoginPage(webdriver);
	}
	
	@Test
	public void testLogingForm() throws InterruptedException {
		String expectedUserName = "xxxxxx";
		login.setUsername(expectedUserName);

		String expectedPassword = "xxxxxx";
		login.setPassword(expectedPassword);
		
		String actualPassword = login.getPassword().getAttribute("value");
		assertEquals(expectedPassword, actualPassword);
		
		String actualUserName = login.getUsername().getAttribute("value");
		assertEquals(expectedUserName, actualUserName);
		
	}
	

}
