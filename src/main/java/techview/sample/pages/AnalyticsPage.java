package techview.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import techview.sample.configuration.ConfigurationUtil;

public class AnalyticsPage {

	
	private WebDriver driver;
	
	@FindBy(how= How.CSS, using="body > app-root > div > app-analytics > p")
	@CacheLookup
	WebElement header;
	
	
	public AnalyticsPage(WebDriver driver) {
		this.driver= driver;
		driver.get(ConfigurationUtil.baseUrl + "/analytics");
		PageFactory.initElements(driver, this);
	}
	
	public void search() {
		header.getText();
	}
	
	
	
}
