package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class BenchmarkPage extends ReusuableCode {
	public BenchmarkPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By benchmark = By.xpath("//android.view.View[@content-desc=\"Benchmark\"]");
	private By EndShift = By.xpath("//android.widget.Button[@content-desc=\"End Shift\"]");
	private By closeButton = By.xpath("//android.view.View[@content-desc=\"Close\"]");

	public void endShift() {
		elementToAppear(driver.findElement(benchmark));
		driver.findElement(benchmark).click();
		elementToAppear(driver.findElement(EndShift));
		driver.findElement(EndShift).click();
		elementToAppear(driver.findElement(closeButton));
		driver.findElement(closeButton).click();
	}

}
