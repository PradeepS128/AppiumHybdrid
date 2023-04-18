package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class Dashboard extends ReusuableCode {
	public Dashboard(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	By more=By.xpath("//android.widget.ImageView[@content-desc='More']");
	By home=By.xpath("//android.widget.ImageView[@content-desc='Home']");
	
	
	public void moreButton()
	{
	elementToAppear(driver.findElement(more));
	try {
		driver.findElement(more).click();
	} catch (Exception e) {
		driver.findElement(more).click();		}
	}
	
	public void homeButton() 
	{
	elementToAppear(driver.findElement(home));
	driver.findElement(home).click();
	}
	
	}
	