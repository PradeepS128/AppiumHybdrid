package _Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import _POM.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public AppiumDriver driver;
	private AppiumDriverLocalService service;
	public AppiumDriver getdriver() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream(
				"D:\\New folder\\Java Automation\\AppiumHybdrid____\\src\\main\\java\\property_files\\global.properties");
		properties.load(inputStream);

		capabilities.setCapability("platformName", "" + properties.getProperty("platformName") + "");
		capabilities.setCapability("deviceName", "" + properties.getProperty("deviceName") + "");
		capabilities.setCapability("appPackage", "" + properties.getProperty("appPackage") + "");
		capabilities.setCapability("appActivity", "" + properties.getProperty("appActivity") + "");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("automationName", "" + properties.getProperty("automationName") + "");
		capabilities.setCapability("autoGrantPermissions", "true");

//		AppiumServiceBuilder builder=new AppiumServiceBuilder();
//		builder.withIPAddress("http://0.0.0.0:");
//		builder.usingPort(4723);
//		builder.
//		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
//		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
//		service=AppiumDriverLocalService.buildService(builder);

		driver = new AndroidDriver(new URL("" + properties.getProperty("URL") + ""), capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		return driver;
	}

	public String getScreenshot(String testcaseName, AppiumDriver driver) throws IOException {
		TakesScreenshot screenshot = driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//Report//" + testcaseName + ".png";
		File dst = new File(path);
		FileUtils.copyFile(file, dst);
		return path;
	}

	@BeforeSuite
	public void loginApplication() throws IOException, InterruptedException {
//		service.start();
		driver = getdriver();
		LoginPage page = new LoginPage(driver);
		page.continueTOHome();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
