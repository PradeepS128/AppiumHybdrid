package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class ServicesPage extends ReusuableCode {
	public ServicesPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By first_Filter_All = By.xpath("//android.widget.ImageView[@content-desc=\"All\"]");
	private By first_Filter_Ride = By.xpath("//android.widget.ImageView[@content-desc=\"Ride\"]");
	private By first_Filter_Delivery = By.xpath("//android.widget.ImageView[@content-desc=\"Delivery\"]");
	private By first_Filter_Apply = By.xpath("//android.widget.Button[@content-desc=\"Apply\"]");
	private By first_Filter_Cancel = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");

	private By Last30Days = By.xpath("//android.widget.ImageView[@content-desc=\"Last 30 Days\"]");
	private By Last7Days = By.xpath("//android.view.View[@content-desc=\"Last 7 Days\"]/android.widget.RadioButton");
	private By Today = By.xpath("//android.view.View[@content-desc=\"Today\"]/android.widget.RadioButton");
	private By Custom_radio = By.xpath("//android.view.View[@content-desc=\"Custom\"]/android.widget.RadioButton");
	private By Last30Days_radio = By
			.xpath("//android.view.View[@content-desc=\"Last 30 Days\"]/android.widget.RadioButton");
	private By Custom = By.xpath("//android.widget.ImageView[@content-desc='Custom']");

	public void last30Days() {
		elementToAppear(driver.findElement(Last30Days));
		driver.findElement(Last30Days).click();
	}

	public void filterByType_Days() throws InterruptedException {
		last30Days();
		elementToAppear(driver.findElement(Last7Days));
		driver.findElement(Last7Days).click();
		driver.findElement(Today).click();
		driver.findElement(Custom_radio).click();
		elementToAppear(driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']")));
		try {
			driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']")).click();
		}
		Thread.sleep(2000);
		elementToAppear(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Apply\"]")));
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Apply\"]")).click();
		elementToAppear(driver.findElement(Custom));
		driver.findElement(Custom).click();
		elementToAppear(driver.findElement(Last30Days_radio));
		driver.findElement(Last30Days_radio).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Apply\"]")).click();
	}

	public void filterByType_All() throws InterruptedException {
		elementToAppear(driver.findElement(first_Filter_All));
		driver.findElement(first_Filter_All).click();
		Thread.sleep(2000);
		driver.findElement(first_Filter_Delivery).click();
		Thread.sleep(1000);
		driver.findElement(first_Filter_Ride).click();
		Thread.sleep(1000);
		driver.findElement(first_Filter_All).click();
		Thread.sleep(1000);
		driver.findElement(first_Filter_Apply).click();
	}

}
