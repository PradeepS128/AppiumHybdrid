package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class LoginPage extends ReusuableCode {
	public AppiumDriver driver;
	public String msg;

	public LoginPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By getOtp = By.xpath("//android.view.View[@content-desc='Get OTP']");
	private By mobileNumber = By.xpath("//android.widget.EditText[@index=2]");
	private By verfiyAndLogin = By.xpath("//android.view.View[@content-desc='Verify & Login']");
	private By enterOTP = By.xpath("//android.widget.EditText[@index=3]");
	private By continueHome = By.xpath("//android.widget.Button[@index=3]");

	public void getOTP() throws InterruptedException {
		elementToAppear(driver.findElement(mobileNumber));
		driver.findElement(mobileNumber).click();
		Thread.sleep(2);
		driver.findElement(mobileNumber).sendKeys("9008041892");

		elementToAppear(driver.findElement(getOtp));
		driver.findElement(getOtp).click();
	}

	public void enterOTP() throws InterruptedException {
		getOTP();
		elementToAppear(driver.findElement(enterOTP));
		driver.findElement(enterOTP).sendKeys("8370");

		driver.findElement(verfiyAndLogin).click();
	}

	public void continueTOHome() throws InterruptedException {
		enterOTP();
		elementToAppear(driver.findElement(continueHome));
		driver.findElement(continueHome).click();
		Thread.sleep(10000);
	}

}