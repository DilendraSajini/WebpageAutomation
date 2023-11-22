package techview.sample.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import techview.sample.configuration.ConfigurationUtil;

public class ServerPage {

	private WebDriverWait wait;
	
	@FindBy(how= How.ID, using="usename")
	@CacheLookup
	private WebElement username;

	public ServerPage(WebDriver driver) {
		//driver.get(ConfigurationUtil.baseUrl + "/analytics");
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public WebElement getUsername() {
		return username;
	}

	public void populate(String username) {
		setUsername(username);
	}
	
	protected void setUsername(String username) {
		wait.until(ExpectedConditions.visibilityOf(this.username));
		this.username.sendKeys(username);
	}
	
}
