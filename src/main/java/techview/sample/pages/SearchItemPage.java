package techview.sample.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import techview.sample.configuration.ConfigurationUtil;

public class SearchItemPage {

	private WebDriver driver;

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
	}

	public void search(String item) throws InterruptedException {
		searchBox.sendKeys("JBL earphones");
		searchIcon.click();
		Thread.sleep(4000);
		checkBox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(4000);
	}

}
