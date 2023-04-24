package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class MorePage extends ReusuableCode {
	public MorePage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By logout = By.xpath("//android.widget.ImageView[@content-desc='Logout']");
	private By myProfile = By.xpath("//android.view.View[@content-desc='My Profile']");
	private By leavesButton = By.xpath("//android.view.View[@content-desc=\"Leaves\"]");
	private By About3EcoButton = By.xpath("//android.view.View[@content-desc=\"About 3eco\"]");
	private By Disputesbutton = By.xpath("//android.view.View[@content-desc=\"Disputes\"]");
	private By Legal = By.xpath("//android.view.View[@content-desc=\"Legal\"]");
	private By TC_button = By.xpath("//android.view.View[@content-desc=\"T&C\"]");
	private By Support = By.xpath("//android.view.View[@content-desc=\"Support\"]");
	private By logoutButton=By.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]");

	public void MyProfile() {
		elementToAppear(driver.findElement(myProfile));
		driver.findElement(myProfile).click();
	}

	public void Leaves() {
		elementToAppear(driver.findElement(leavesButton));
		driver.findElement(leavesButton).click();
	}

	public void about3Eco() {
		elementToAppear(driver.findElement(About3EcoButton));
		driver.findElement(About3EcoButton).click();
	}

	public void legal() {
		elementToAppear(driver.findElement(Legal));
		driver.findElement(Legal).click();
	}

	public void tandC() {
		elementToAppear(driver.findElement(TC_button));
		driver.findElement(TC_button).click();
	}

	public void support() {
		elementToAppear(driver.findElement(Support));
		driver.findElement(Support).click();
	}

	public void logoutApp()
	{
	elementToAppear(driver.findElement(logoutButton));
	driver.findElement(logoutButton);
	}
}
