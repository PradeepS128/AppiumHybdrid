package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class LeavesPage extends ReusuableCode {
	public LeavesPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By newButton = By.xpath("//android.widget.Button[@index=2]");
	private By startDateButton = By.xpath("(//android.widget.ImageView[@content-desc=\"DD MM YYYY\"])[1]");
	private By okButton = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");
	private By endDateButton = By.xpath("//android.widget.ImageView[@content-desc=\"DD MM YYYY\"]");
	private By leaveReasonButton = By.xpath("(//android.widget.ImageView)[4]");
	private By sickLeaveButton = By.xpath("//android.widget.Button[@content-desc=\"Sick Leave\"]");
	private By reasonForLeaveButton = By.xpath("//android.widget.EditText[@index=7]");
	private By reasonForLeaveName = By.xpath("//android.view.View[@content-desc=\"Reasons for Leave\"]");
	private By applyButton = By.xpath("//android.widget.Button[@content-desc=\"Apply\"]");
	private By cancleButton = By.xpath("//android.view.View[@content-desc=\"Cancel\"]");
	private By backButton = By.xpath("(//android.view.View[@index=0])[5]");

	public void newLeaves() {
		elementToAppear(driver.findElement(newButton));
		driver.findElement(newButton).click();
	}

	public void applyForLeave() throws InterruptedException {
		newLeaves();
		elementToAppear(driver.findElement(startDateButton));
		driver.findElement(startDateButton).click();
		elementToAppear(driver.findElement(okButton));
		driver.findElement(okButton).click();
		elementToAppear(driver.findElement(endDateButton));
		driver.findElement(endDateButton).click();
		elementToAppear(driver.findElement(okButton));
		driver.findElement(okButton).click();
		elementToAppear(driver.findElement(leaveReasonButton));
		driver.findElement(leaveReasonButton).click();
		driver.findElement(sickLeaveButton).click();
		elementToAppear(driver.findElement(reasonForLeaveButton));
		driver.findElement(reasonForLeaveButton).click();
		driver.findElement(reasonForLeaveButton).sendKeys("my wish");
		Thread.sleep(2000);
		driver.findElement(reasonForLeaveName).click();
	}

	public void applyForLeave_apply() throws InterruptedException {
		applyForLeave();
		elementToAppear(driver.findElement(applyButton));
		driver.findElement(applyButton).click();
		elementToAppear(driver.findElement(backButton));
		driver.findElement(backButton).click();
	}

	public void applyForLeave_cancel() throws InterruptedException {
		applyForLeave();
		elementToAppear(driver.findElement(cancleButton));
		driver.findElement(cancleButton).click();
	}

}
