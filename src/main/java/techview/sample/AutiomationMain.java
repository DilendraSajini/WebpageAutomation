package techview.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import techview.sample.drivers.DriverFactory;
import techview.sample.pages.SearchItemPage;

public class AutiomationMain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver("chrome");
		SearchItemPage searchItemPage = PageFactory.initElements(driver, SearchItemPage.class);
		searchItemPage.search("JBL earphones");;
		driver.close();
	}

}
