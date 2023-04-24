package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class TandCPage extends ReusuableCode {
	public TandCPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By kannadaButton=By.xpath("(//android.view.View[@index=2])[1]");
	By tamilButton=By.xpath("(//android.view.View[@index=3])[1]");
	By teluguButton=By.xpath("(//android.view.View[@index=4])[1]");
	By backButton=By.xpath("(//android.view.View)[6]");

	public void kannada() {
		elementToAppear(driver.findElement(kannadaButton));
		driver.findElement(kannadaButton).click();
	}
	public void tamil() {
		elementToAppear(driver.findElement(tamilButton));
		driver.findElement(tamilButton).click();
	}
	public void telugu() {
		elementToAppear(driver.findElement(teluguButton));
		driver.findElement(teluguButton).click();
		backButton();
	}
	public void backButton() {
		elementToAppear(driver.findElement(backButton));
		try {
			driver.findElement(backButton).click();
					} catch (Exception e) {
						driver.findElement(backButton).click();
		}
	}
}
