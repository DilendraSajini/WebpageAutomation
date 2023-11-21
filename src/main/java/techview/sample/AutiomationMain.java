package techview.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import techview.sample.drivers.DriverFactory;
import techview.sample.pages.AnalyticsPage;
import techview.sample.pages.LoginPage;


public class AutiomationMain {


	public static void main(String args[]) throws InterruptedException{
		WebDriver webdriver = DriverFactory.getDriver("chrome");
//		SearchItemPage searchItemPage = PageFactory.initElements(driver, SearchItemPage.class);
//		searchItemPage.search("JBL earphones");
//		
		LoginPage login = PageFactory.initElements(webdriver, LoginPage.class);
		login.search();
		AnalyticsPage analytics = PageFactory.initElements(webdriver, AnalyticsPage.class);
		//webdriver.getPageSource().
		webdriver.close();
	}

}
