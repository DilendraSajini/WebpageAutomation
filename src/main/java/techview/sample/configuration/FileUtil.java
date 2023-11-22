package techview.sample.configuration;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FileUtil {

	public static void takeScreenShot(WebDriver webdriver) throws IOException {
		File file  = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		File screenshot = new File("build/screenshots/" + "tmp" + ".png");
		FileUtils.copyFile(file, screenshot);
	}
	
}
