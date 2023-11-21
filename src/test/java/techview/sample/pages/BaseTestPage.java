package techview.sample.pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import techview.sample.drivers.DriverFactory;

public class BaseTestPage {

	protected WebDriver webdriver;
	
	@BeforeAll
	public static void setup() {
	}
	
	@BeforeEach
	public void init() {
		webdriver = DriverFactory.getDriver("chrome");
	}

	@AfterEach
	public void clear() {
		webdriver.close();
	}
}
