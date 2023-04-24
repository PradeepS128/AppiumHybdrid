package TestScripts;

import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;

import _POM.About3Eco;
import _POM.BenchmarkPage;
import _POM.Dashboard;
import _POM.HomePage;
import _POM.LeavesPage;
import _POM.LegalPage;
import _POM.LoginPage;
import _POM.MorePage;
import _POM.MyProfile;
import _POM.PersonalDocuments;
import _POM.ServicesPage;
import _POM.SupportPage;
import _POM.TandCPage;
import _POM.TimesheetPage;
import _Utility.BaseClass;

public class ObjectClass extends BaseClass {
	public String msg;
	public LoginPage loginPage;
	public Dashboard dashboard;
	public MyProfile myProfile;
	public MorePage morePage;
	public HomePage homePage;
	public String nos_before;
	public String mg_before;
	public String cpt_before;
	public String total_before;
	public LeavesPage leavesPage;
	public TimesheetPage timesheetPage;
	public ServicesPage servicePage;
	public BenchmarkPage benchmarkPage;
	public Faker faker;
	public PersonalDocuments personalDocumentsPage;
	public About3Eco about3Eco;
	public LegalPage legalPage;
	public TandCPage tandCPage;
	public SupportPage supportPage;


	@BeforeClass
	public void pageObjects() {
		dashboard = new Dashboard(driver);
		myProfile = new MyProfile(driver);
		morePage = new MorePage(driver);
		dashboard.homeButton();
		leavesPage = new LeavesPage(driver);
		timesheetPage = new TimesheetPage(driver);
		servicePage = new ServicesPage(driver);
		benchmarkPage = new BenchmarkPage(driver);
		personalDocumentsPage = new PersonalDocuments(driver);
		about3Eco=new About3Eco(driver);
		faker = new Faker();
		legalPage=new LegalPage(driver);
		tandCPage=new TandCPage(driver);
		supportPage=new SupportPage(driver);
	}


}
