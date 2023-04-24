package _POM;

import org.openqa.selenium.By;

import Utils_.ReusuableCode;
import io.appium.java_client.AppiumDriver;

public class MyProfile extends ReusuableCode {
	public MyProfile(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By nameEdit = By.xpath("//android.widget.ImageView[@index=5]");
	private By fullName = By.xpath("//android.widget.EditText[@index=0]");
	private By save = By.xpath("//android.widget.Button[@content-desc='Save']");
	private By phoneNumber = By.xpath("(//android.view.View[@index=1])[4]");
	private By UploadImage = By.xpath("//android.widget.ImageView[@content-desc=\"Upload Image\"]");
	private By Gallery = By.xpath("//android.widget.Button[@content-desc=\"GALLERY\"]");
	private By galleryImage = By.xpath("(//android.widget.ImageView[@index=0])[5]");
	private By personalDocumentsButton = By.xpath("//android.widget.ImageView[@content-desc=\"Personal Documents\"]");
	private By back=By.xpath("(//android.view.View[@index=0])[6]");

	public void editProfile() {
		elementToAppear(driver.findElement(nameEdit));
		driver.findElement(nameEdit).click();
	}

	public void saveButton() {
		elementToAppear(driver.findElement(save));
		driver.findElement(save).click();
	}

	public void EditName(String name) throws InterruptedException {
		editProfile();
		elementToAppear(driver.findElement(fullName));
		driver.findElement(fullName).click();
		elementToAppear(driver.findElement(fullName));
		driver.findElement(fullName).sendKeys(name);
		Thread.sleep(3000);
		elementToAppear(driver.findElement(phoneNumber));
		driver.findElement(phoneNumber).click();
		Thread.sleep(3000);
		saveButton();
	}

	public void uploadImage() throws InterruptedException {
		editProfile();
		elementToAppear(driver.findElement(UploadImage));
		driver.findElement(UploadImage).click();
		elementToAppear(driver.findElement(Gallery));
		driver.findElement(Gallery).click();
		Thread.sleep(2000);
		elementToAppear(driver.findElement(galleryImage));
		driver.findElement(galleryImage).click();
		saveButton();
	}

	public void personalDocuments()
	{
	elementToAppear(driver.findElement(personalDocumentsButton));
	try {
		driver.findElement(personalDocumentsButton).click();
	} catch (Exception e) {
		driver.findElement(personalDocumentsButton).click();
	}
	}

	public void backButton()
	{
	elementToAppear(driver.findElement(back));
	driver.findElement(back).click();
	}
}
