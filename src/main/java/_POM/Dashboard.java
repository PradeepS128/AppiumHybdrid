package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class Dashboard extends ReusuableCode {
	public Dashboard(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By more = By.xpath("//android.widget.ImageView[@content-desc='More']");
	private By home = By.xpath("//android.widget.ImageView[@content-desc='Home']");
	private By services = By.xpath("//android.widget.ImageView[@content-desc=\"Services\"]");
	private By timesheet = By.xpath("//android.widget.ImageView[@content-desc=\"Timesheet\"]");

	public void moreButton() {
		elementToAppear(driver.findElement(more));
		try {
			driver.findElement(more).click();
		} catch (Exception e) {
			driver.findElement(more).click();
		}
	}

	public void homeButton() {
		elementToAppear(driver.findElement(home));
		driver.findElement(home).click();
	}

	public void servicesButton() {
		elementToAppear(driver.findElement(services));
		driver.findElement(services).click();
	}

	public void timesheetButton() {
		elementToAppear(driver.findElement(timesheet));
		driver.findElement(timesheet).click();

	}
}
