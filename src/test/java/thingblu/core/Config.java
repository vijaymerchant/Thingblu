package thingblu.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import thingblu.pages.AssignTask;
import thingblu.pages.LotEntry;
import thingblu.pages.MenuNavigation;
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

	
	@BeforeClass
	public void initBrowser() throws Exception {
		//logger = Logger.getLogger(getClass());
		//PropertyConfigurator.configure("D:\\somanath\\gitRepositoryData\\math2shine\\logs\\log4j.properties");
		//report = new ExtentReports("D:\\somanath\\gitRepositoryData\\math2shine\\reports\\math2shine.html")
		driver = WebDriverManager.getInstance("chrome");

		signIn = PageFactory.initElements(driver, SignInPage.class);
		navigation = PageFactory.initElements(driver, MenuNavigation.class);
		orderEntryPage = PageFactory.initElements(driver, OrderEntryForm.class);
		lotEntryPage = PageFactory.initElements(driver, LotEntry.class);
		assignTaskPage= PageFactory.initElements(driver, AssignTask.class);
				
				
		driver.get(Constants.testLink);
		logIntoSystem("th!ngblu","123456");
		Thread.sleep(2000);
	}
	
	
/*	@AfterMethod
	public void TakeFailedCasesScreenshot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			FailedCasesScreenshot fs = new FailedCasesScreenshot();
			fs.takeScreenShot(driver, result.getName());
			etlogger.log(LogStatus.FAIL, result.getName());
		}
	}
	
	@AfterTest
	public void closeReports() {
		report.endTest(etlogger);
		report.flush();
		driver.get("D:/somanath/gitRepositoryData/math2shine/reports/math2shine.html");
	}*/
	
	

	public void logIntoSystem(String username, String password) {
		signIn.setUsername(username);
		signIn.setPassword(password);
		signIn.ClickSignInBtn();
	}

}
