package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class PersonalDocuments extends ReusuableCode {
	public PersonalDocuments(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By bankPassbookName = By.xpath("//android.view.View[@content-desc=\"Bank Passbook \"]");
	private By aadharCard = By.xpath("//android.view.View[@content-desc=\"Aadhar Card \"]");
	private By PancardName = By.xpath("//android.view.View[@content-desc=\"Aadhar Card \"]");
	private By driverLicenceBack_Name = By.xpath("//android.view.View[@content-desc=\"Aadhar Card \"]");
	private By driverLicenceFront_Name = By
			.xpath("//android.view.View[@content-desc=\"Driving License Front Side *\"]");
	private By pancardUpload_Button = By.xpath("(//android.widget.ImageView[@content-desc=\"Upload Document\"])[1]");
	private By AdharUpload_Button = By.xpath("(//android.widget.ImageView[@content-desc=\"Upload Document\"])[2]");
	private By BankPassbook_Button = By.xpath("(//android.widget.ImageView[@content-desc=\"Upload Document\"])[3]");
	private By SaveButton = By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
	private By CancelButton = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");

	public String bankPassbookName() {
		return driver.findElement(bankPassbookName).getText();
	}

	public String adharCardName() {
		return driver.findElement(aadharCard).getText();
	}

	public String pancardName() {
		return driver.findElement(PancardName).getText();
	}

	public String driverLicenceBackName() {
		return driver.findElement(driverLicenceBack_Name).getText();
	}

	public String driverLicenceFrontName() {
		return driver.findElement(driverLicenceFront_Name).getText();
	}

	public boolean pancardUpload() {
		return driver.findElement(pancardUpload_Button).isEnabled();
	}

	public boolean adharUpload() {
		return driver.findElement(AdharUpload_Button).isEnabled();
	}

	public boolean bankPassbookUpload() {
		return driver.findElement(BankPassbook_Button).isEnabled();
	}

	public void cancelButton() {
		 driver.findElement(CancelButton).click();
	}

	public void saveButton() {
		elementToAppear(driver.findElement(SaveButton));
		 driver.findElement(SaveButton).click();
	}

}
