package techview.sample.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import techview.sample.configuration.ConfigurationUtil;

public class DriverFactory {

	public static WebDriver getDriver(String type) {
		switch (type) {
		case "chrome":
			return getCromeDriver();
		}
		return new ChromeDriver();

	}

	private static ChromeDriver getCromeDriver() {
		ConfigurationUtil.setChromeDriverConfiguration();
		ChromeDriver driver = new ChromeDriver(getChromeOptions());
		setDriverManageOptions(driver);
		return driver;
	}

	private static void setDriverManageOptions(ChromeDriver driver) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS); removed to add explicit wait
		//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	}
	
	private static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		//setPageLoadStratergy()
		return options;
	}
}
