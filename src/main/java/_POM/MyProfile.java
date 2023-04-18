package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class MyProfile extends ReusuableCode {
	public MyProfile(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By nameEdit=By.xpath("//android.widget.ImageView[@index=4]");
	By fullName=By.xpath("//android.widget.EditText[@index=0]");
	By save=By.xpath("//android.widget.Button[@content-desc='Save']");
	By phoneNumber=By.xpath("(//android.view.View[@index=1])[4]");

	public void EditName() throws InterruptedException
	{
	elementToAppear(driver.findElement(nameEdit));
	driver.findElement(nameEdit).click();
	elementToAppear(driver.findElement(fullName));
	driver.findElement(fullName).click();
	Thread.sleep(3000);
	driver.findElement(fullName).sendKeys("pradeep kumar");
	Thread.sleep(3000);
	elementToAppear(driver.findElement(phoneNumber));
	driver.findElement(phoneNumber).click();
	elementToAppear(driver.findElement(save));
	driver.findElement(save).click();
	Thread.sleep(3000);
		}
}
