package techview.sample.configuration;

public class ConfigurationUtil {

	public final static String baseUrl = "https://www.amazon.in/";
	public static void setChromeDriverConfiguration() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver-win64\\chromedriver.exe");
	}
}
