package thingblu.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

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
	
	
	@BeforeClass
	public void initBrowser() {
		driver = WebDriverManager.getInstance("chrome");
		
		signIn= PageFactory.initElements(driver,SignInPage.class );
		navigation=PageFactory.initElements(driver,MenuNavigation.class );
		orderEntryPage=PageFactory.initElements(driver,OrderEntryForm.class );
		lotEntryPage=PageFactory.initElements(driver,LotEntry.class );
		
		driver.get(Constants.testLink);
	}
	
	/*@AfterClass
	public void closeBrowser() {
		driver.close();
	}*/
	

}
