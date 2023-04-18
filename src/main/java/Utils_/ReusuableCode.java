package Utils_;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class ReusuableCode {
	public AppiumDriver driver;
	public Properties properties;

	public ReusuableCode(AppiumDriver driver) {
		this.driver = driver;
	}

	public void elementToAppear(WebElement element)
	{
	WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(30));
	driverWait.until(ExpectedConditions.visibilityOf(element));
	}


	public Properties name() throws Exception {
		properties=new Properties();
		FileInputStream fileInputStream=new FileInputStream("D:\\New folder\\Java Automation\\AppiumHybdrid\\src\\main\\java\\property_files\\global.properties");
		properties.load(fileInputStream);
		return properties;

	}
}
