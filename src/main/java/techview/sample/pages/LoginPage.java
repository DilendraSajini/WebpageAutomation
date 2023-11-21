package techview.sample.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import techview.sample.configuration.ConfigurationUtil;

public class LoginPage {

	private WebDriverWait wait;
	
	@FindBy(how = How.ID, using = "form2Example1")
	@CacheLookup
	private WebElement username;

	@FindBy(how = How.ID, using = "form2Example2")
	@CacheLookup
	private WebElement password;

	@FindBy(how = How.CSS, using = "body > app-root > div > app-startup > app-login > form > button")
	@CacheLookup
	private WebElement signin;

	@FindBy(how= How.LINK_TEXT, using="Forgot password?")
	@CacheLookup
	private WebElement forgotPassword;


	public LoginPage(WebDriver driver) {
		driver.get(ConfigurationUtil.baseUrl);
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	
	public void populate(String username, String password) throws InterruptedException {
		setUsername(username);
		setPassword(password);
		clickForgotPassword();
		//clickSignin();
	}

	protected void setUsername(String username) {
		this.username.sendKeys(username);
	}

	protected void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	protected void clickSignin() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	
	protected void clickForgotPassword() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(password));
		forgotPassword.click();
	}

}
