package thingblu.core;

import org.testng.annotations.DataProvider;

import jxl.read.biff.BiffException;
import thingblu.utility.ExcelReader;

public class DataProviders {

	@DataProvider(name = "Apackdata")
	public Object[][] orderEntryData() throws BiffException, Exception {
		Object[][] arrayObject = ExcelReader.getExcelData(Constants.orderDataFile, "Sheet1");
		return arrayObject;
	}

	@DataProvider(name = "LotEntryData")
	public Object[][] lotEntryData() throws BiffException, Exception {
		Object[][] arrayObject = ExcelReader.getExcelData(Constants.lotEntryFile, "Sheet1");
		return arrayObject;
	}

	@DataProvider(name = "TrimmingTaskData")
	public Object[][] trimmingTaskData() throws BiffException, Exception {
		Object[][] arrayObject = ExcelReader.getExcelData(Constants.taskAssignFile, "Sheet1");
		return arrayObject;
	}

	@DataProvider(name = "SiftingTaskData")
	public Object[][] siftingTaskData() throws BiffException, Exception {
		Object[][] arrayObject = ExcelReader.getExcelData(Constants.taskAssignFile, "Sheet2");
		return arrayObject;
	}

	@DataProvider(name = "GrindingTaskData")
	public Object[][] grindingTaskData() throws BiffException, Exception {
		Object[][] arrayObject = ExcelReader.getExcelData(Constants.taskAssignFile, "Sheet3");
		return arrayObject;
	}
	
	@DataProvider(name = "JointsTaskData")
	public Object[][] jointsTaskData() throws BiffException, Exception {
		Object[][] arrayObject = ExcelReader.getExcelData(Constants.taskAssignFile, "Sheet4");
		return arrayObject;
	}
}
