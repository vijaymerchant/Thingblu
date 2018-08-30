package thingblu.utility.listners;

import com.relevantcodes.extentreports.ExtentReports;

import thingblu.core.Constants;

public class ExtentManager {
	 private static ExtentReports extent;
	 
	    public synchronized static ExtentReports getReporter(){
	        if(extent == null){
	            //Set HTML reporting file location
	            extent = new ExtentReports(Constants.extentFilePath, true);
	        }
	        return extent;
	    }
}
