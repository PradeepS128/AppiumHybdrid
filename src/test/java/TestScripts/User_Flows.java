package TestScripts;

import org.testng.annotations.Test;

import _POM.HomePage;

public class User_Flows extends ObjectClass {

	@Test(priority = 1, groups = { "regression", "Smoke" })
	public void changeUserName() throws Exception {
		dashboard.moreButton();
		morePage.MyProfile();
		myProfile.EditName("" + faker.name().firstName() + "");
	}

	@Test(priority = 2)
	public void scannVechile() throws InterruptedException {
		homePage = new HomePage(driver);
		dashboard.homeButton();
		homePage.scanVechile();
		Thread.sleep(6000);
	}

	@Test(priority = 3)
	public void startDelivery() throws InterruptedException {
		homePage.startDelivery();
	}

	@Test(priority = 4)
	public void completeEntireDeliver() throws InterruptedException {
		homePage.completeDelivery();
	}

	@Test(priority = 5)
	public void verify_dropdownFunctionality_in_Services() throws InterruptedException {
		dashboard.servicesButton();
		servicePage.filterByType_All();
		Thread.sleep(2000);
		servicePage.filterByType_Days();
	}

	@Test(priority = 6, enabled = true)
	public void changeProfile() throws InterruptedException {
		dashboard.moreButton();
		morePage.MyProfile();
		myProfile.uploadImage();
	}

	@Test(priority = 7)
	public void applyForLeave_withCancelButton() throws InterruptedException {
		morePage.Leaves();
		leavesPage.applyForLeave_cancel();
	}

	@Test(priority = 8)
	public void applyForLeave_withApplyButton() throws InterruptedException {
		leavesPage.applyForLeave_apply();
	}

	@Test(priority = 9)
	public void Timesheet_flow() {
		dashboard.timesheetButton();
	}

	@Test(priority = 10)
	public void filterByDate_HistoryDropdown_() {
		timesheetPage.filterByDate_HistoryDropdown();
	}

	@Test(priority = 11)
	public void benchMark_functionality() {
		dashboard.moreButton();
		benchmarkPage.endShift();
	}

	@Test(priority = 12)
	public void personalDocuments() {
		dashboard.moreButton();
		morePage.MyProfile();
		myProfile.personalDocuments();
		personalDocumentsPage.saveButton();
		myProfile.backButton();
	}

	@Test(priority = 13)
	public void aboutThreeEco() {
		morePage.about3Eco();
		about3Eco.backButton();

	}
	@Test(priority = 14,enabled = false)
	public void legal_functionality() {
		morePage.legal();
	}

	@Test(priority = 14)
	public void tandC_functionality() throws InterruptedException {
		morePage.tandC();
		tandCPage.kannada();
		Thread.sleep(2000);
		tandCPage.tamil();
		Thread.sleep(2000);
		tandCPage.telugu();
		Thread.sleep(2000);
	}

	@Test(priority = 15)
	public void support_Functionality() {
		morePage.support();
		supportPage.Fos_manual();
		supportPage.training();
		supportPage.backButton_();
	}

	@Test(priority = 16)
	public void historyIn_Timesheet()
	{
		dashboard.timesheetButton();
		timesheetPage.historyRecords();
	}

	@Test(priority = 17)
	public void logout() {
		dashboard.moreButton();
		morePage.logoutApp();
	}

}


