package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class MorePage extends ReusuableCode {
	public MorePage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By logout=By.xpath("//android.widget.ImageView[@content-desc='Logout']");
	By myProfile=By.xpath("//android.view.View[@content-desc='My Profile']");

	public void MyProfile()
	{
	elementToAppear(driver.findElement(myProfile));
	driver.findElement(myProfile).click();
	}

	public void logout()
	{
	elementToAppear(driver.findElement(logout));
	driver.findElement(logout).click();
	}

}
