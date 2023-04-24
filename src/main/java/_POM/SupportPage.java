package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class SupportPage extends ReusuableCode {
	public SupportPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By Fos_manualButton=By.xpath("(//android.view.View[@index=1])[3]");
	private By trainingVideos=By.xpath("(//android.view.View[@index=2])[1]");
	private By backButton=By.xpath("(//android.view.View)[6]");

	public void Fos_manual() {
		elementToAppear(driver.findElement(Fos_manualButton));
		driver.findElement(Fos_manualButton).click();
	}

	public void training() {
		elementToAppear(driver.findElement(trainingVideos));
		driver.findElement(trainingVideos).click();
	}
	public void backButton_() {
		elementToAppear(driver.findElement(backButton));
try {
	driver.findElement(backButton).click();
} catch (Exception e) {
	driver.findElement(backButton).click();
}	}

}
