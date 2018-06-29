package thingblu.core;

import org.openqa.selenium.Platform;

public class Constants {
	
	public static final String chromeDriverPath = "D:\\somanath\\automation_work\\Thingblu\\Drivers\\chromedriver.exe";
	public static final String IEDriverPath = "D:\\somanath\\automation_work\\Thingblu\\Drivers\\IEDriverServer.exe";
	public static final String firefoxDriverPath = "D:\\somanath\\automation_work\\Thingblu\\Drivers\\geckodriver.exe";
	public static final String safariDriverPath = "";
	public static final String testLink= "http://192.168.5.148/thingbluprocessor/#/login";
	public static final String uatLink= "https://thingbluuat.azurewebsites.net/#/login";
	public static final String liveLink= "";
	public static final String userTypes = "";
	
	//file locations
	public final String log4jFilePath = "D:\\somanath\\automation_work\\Thingblu\\Loggers\\log4j.properties";
	public final String testReportFilePath = "D:\\somanath\\automation_work\\Thingblu\\TestReports\\thingbluTestReport.html";
	public static final String propertiesFilePath="D:\\somanath\\automation_work\\ThingBluTest\\src\\test\\resources\\projectdata.properties";
	
	
	//Excel file locations
	public static final String lotEntryFile ="D:\\somanath\\AutomationData\\Thingblu-Testdata\\Lot-Entry-Data.xls";
	public static final String orderDataFile="D:\\somanath\\AutomationData\\Thingblu-Testdata\\orderEntryData.xls";
	public static final String taskAssignFile ="D:\\somanath\\AutomationData\\Thingblu-Testdata\\TaskAssignData.xls";
	
			
			
	//Grid setup
	public static final Boolean USE_GRID = false;
	public static final Platform platform= Platform.ANY;
	public static final String HUB_URL="";
	public static final String NODE1_URL="http://192.168.0.5:5555/wd/hub";
	public static final String NODE2_URL="http://192.168.0.9:5555/wd/hub";
}
