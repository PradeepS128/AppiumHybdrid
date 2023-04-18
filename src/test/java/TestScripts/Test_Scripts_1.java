package TestScripts;

import org.testng.annotations.Test;

import _POM.Dashboard;
import _POM.HomePage;
import _POM.LoginPage;
import _POM.MorePage;
import _POM.MyProfile;
import _Utility.BaseClass;




public class Test_Scripts_1 extends BaseClass {
	public String msg;
	public LoginPage loginPage;
	public Dashboard dashboard;
	public MyProfile myProfile;
	public MorePage morePage;
	public HomePage homePage;


	@Test(priority = 1)
	public void changeUserName() throws Exception
	{
	dashboard=new Dashboard(driver);
	myProfile=new MyProfile(driver);
	morePage=new MorePage(driver);

	dashboard.moreButton();
	morePage.MyProfile();
	myProfile.EditName();
	
	}

	@Test(priority = 2)
	public void scannVechile() throws InterruptedException
	{
		dashboard.homeButton();
		homePage=new HomePage(driver);
		homePage.scanVechile();
		Thread.sleep(6000);
	}

	@Test(priority = 3)
	public void name() throws InterruptedException {
		homePage.startDelivery();
	}


}
