package thingblu.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import thingblu.pages.AssignTask;
import thingblu.pages.Emp_DashboardCommon;
import thingblu.pages.LotEntry;
import thingblu.pages.MenuNavigation;
import thingblu.pages.Mngr_DashboardCommon;
import thingblu.pages.OrderEntryForm;
import thingblu.pages.SignInPage;

public class Config {
	protected WebDriver driver;
	protected Logger logger;

	protected SignInPage signIn;
	protected MenuNavigation navigation;
	protected OrderEntryForm orderEntryPage;
	protected LotEntry lotEntryPage;
	protected AssignTask assignTaskPage;
	protected Emp_DashboardCommon emp_dashboard;
	protected Mngr_DashboardCommon mngr_dashboard;

	@BeforeClass
	public void initBrowser() {
		// logger = Logger.getLogger(getClass());
		// PropertyConfigurator.configure("D:\\somanath\\gitRepositoryData\\math2shine\\logs\\log4j.properties");
		// report = new
		// ExtentReports("D:\\somanath\\gitRepositoryData\\math2shine\\reports\\math2shine.html")
		driver = WebDriverManager.getInstance("chrome");

		signIn = PageFactory.initElements(driver, SignInPage.class);
		navigation = PageFactory.initElements(driver, MenuNavigation.class);
		orderEntryPage = PageFactory.initElements(driver, OrderEntryForm.class);
		lotEntryPage = PageFactory.initElements(driver, LotEntry.class);
		assignTaskPage = PageFactory.initElements(driver, AssignTask.class);
		emp_dashboard = PageFactory.initElements(driver, Emp_DashboardCommon.class);
		mngr_dashboard = PageFactory.initElements(driver, Mngr_DashboardCommon.class);

		driver.get(Constants.testLink);
	}

	/*
	 * @AfterMethod public void TakeFailedCasesScreenshot(ITestResult result) {
	 * if (ITestResult.FAILURE == result.getStatus()) { FailedCasesScreenshot fs
	 * = new FailedCasesScreenshot(); fs.takeScreenShot(driver,
	 * result.getName()); etlogger.log(LogStatus.FAIL, result.getName()); } }
	 * 
	 * @AfterTest public void closeReports() { report.endTest(etlogger);
	 * report.flush(); driver.get(
	 * "D:/somanath/gitRepositoryData/math2shine/reports/math2shine.html"); }
	 */

	public void logIntoSystemAsManager(String username, String password) {
		signIn.setUsername(username);
		signIn.setPassword(password);
		signIn.ClickSignInBtn();
	}

	public void logIntoSystemAsEmployee(String username, String password) {
		signIn.setUsername(username);
		signIn.setPassword(password);
		signIn.ClickSignInBtn();
	}

	public void logInToApplicationAs(String userRole) {
		switch (userRole) {
		case "Manager":
			try {
				logIntoSystemAsManager("Th!ngblu", "123456");
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Exception occurs while log in as a manager : "+e.getMessage());
			}
			break;

		case "Employee":
			try {
				logIntoSystemAsEmployee("david", "123456");
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Exception occurs while log in as a manager : "+e.getMessage());
			}
			
			break;

		default:
			System.out.println("UserRole not match of login details are invalid.");
		}

	}
}