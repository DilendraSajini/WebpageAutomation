package techview.sample;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import techview.sample.configuration.FileUtil;
import techview.sample.drivers.DriverFactory;
import techview.sample.pages.AnalyticsPage;
import techview.sample.pages.LoginPage;
import techview.sample.pages.ServerPage;


public class AutiomationMain {


	public static void main(String args[]) throws InterruptedException, IOException{
		WebDriver webdriver = DriverFactory.getDriver("chrome");
//		SearchItemPage searchItemPage = PageFactory.initElements(driver, SearchItemPage.class);
//		searchItemPage.search("JBL earphones");		
		LoginPage login = new LoginPage(webdriver);
		login.populate("xxxxxx","xxxxxx");
		AnalyticsPage analytics = new AnalyticsPage(webdriver);
		webdriver.switchTo().frame("server");
		ServerPage server = new ServerPage(webdriver);
		server.populate("My Name");
		
		FileUtil.takeScreenShot(webdriver);
		
		//webdriver.getPageSource().
		//webdriver.close();
	}

}
