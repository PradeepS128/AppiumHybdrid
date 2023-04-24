package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class TimesheetPage extends ReusuableCode {
	public TimesheetPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By History_today=By.xpath("//android.view.View[@content-desc=\"Today\"]/android.widget.RadioButton");
	private By History_Last30=By.xpath("//android.view.View[@content-desc=\"Last 30 Days\"]/android.widget.RadioButton");
	private By History_Last7=By.xpath("//android.view.View[@content-desc=\"Last 7 Days\"]/android.widget.RadioButton");
	private By History_custom=By.xpath("//android.view.View[@content-desc=\"Custom\"]/android.widget.RadioButton");
	private By History=By.xpath("//android.widget.ImageView[@index=6]");
	private By History_apply=By.xpath("//android.widget.Button[@content-desc=\"Apply\"]");
	private By History_Cancel=By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");
	private By Custome_Apply=By.xpath("//android.view.View[@content-desc=\"Apply\"]");
	private By first_history=By.xpath("(//android.widget.ImageView[@index=0])[2]");
	private By historyBackButton=By.xpath("(//android.view.View[@index=0])[6]");

	public void historyDropdown()
	{
	elementToAppear(driver.findElement(History));
	driver.findElement(History).click();
	}

	public void filterByDate_Today()
	{
		historyDropdown();
		driver.findElement(History_today).click();
		driver.findElement(History_apply).click();
	}

	public void filterByDate_Custom()
	{
		historyDropdown();
		driver.findElement(History_custom).click();
		driver.findElement(History_apply).click();
		driver.findElement(Custome_Apply).click();
	}
	public void filterByDate_Last7()
	{
		historyDropdown();
		driver.findElement(History_Last7).click();
		driver.findElement(History_apply).click();
	}
	public void filterByDate_Last30()
	{
		historyDropdown();
		driver.findElement(History_Last30).click();
		driver.findElement(History_apply).click();
	}

	public void filterByDate_HistoryDropdown()
	{
	filterByDate_Today();
	filterByDate_Last7();
	filterByDate_Last30();
	filterByDate_Custom();
	}

	public void historyRecords()
	{
	elementToAppear(driver.findElement(first_history));
	driver.findElement(first_history).click();
	elementToAppear(driver.findElement(historyBackButton));
	driver.findElement(historyBackButton).click();
	}
}

