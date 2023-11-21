package techview.sample.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest extends BaseTestPage{
	private LoginPage login;

	@Test
	public void testLoginPage() throws InterruptedException {
		login = PageFactory.initElements(webdriver, LoginPage.class);
		login.search();
		Thread.sleep(4000);
		assertEquals("xxxxxx", login.username.getAttribute("value"));
		assertEquals("xxxxxx", login.password.getAttribute("value"));
	}


}
