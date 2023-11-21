package techview.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import techview.sample.configuration.ConfigurationUtil;

public class LoginPage {

	private WebDriver driver;

	@FindBy(how = How.ID, using = "form2Example1")
	@CacheLookup
	WebElement username;

	@FindBy(how = How.ID, using = "form2Example2")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.CSS, using = "body > app-root > div > app-startup > app-login > form > button")
	@CacheLookup
	WebElement signin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		driver.get(ConfigurationUtil.baseUrl);
		PageFactory.initElements(driver, this);
	}

	public void search() {
		username.sendKeys("xxxxxx");
		password.sendKeys("xxxxxx");
	}
	

	public void click() throws InterruptedException {
	
		signin.click();
		Thread.sleep(4000);
	}
}
