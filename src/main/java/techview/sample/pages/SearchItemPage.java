package techview.sample.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import techview.sample.configuration.ConfigurationUtil;

public class SearchItemPage {

	private WebDriver driver;

	private WebDriverWait wait;
	
	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	@CacheLookup
	WebElement searchBox;
	@FindBy(how = How.ID, using = "nav-search-submit-button")
	@CacheLookup
	WebElement searchIcon;
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_89/JBL\"]/span/a/div/label/i")
	@CacheLookup
	WebElement checkBox;

	public SearchItemPage(WebDriver driver) {
		this.driver = driver;
		driver.get(ConfigurationUtil.baseUrl);
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	public void search(String item) throws InterruptedException {
		searchBox.sendKeys("JBL earphones");
		searchIcon.click();

		wait.until(ExpectedConditions.elementToBeClickable(checkBox));
		checkBox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");

	}

}
