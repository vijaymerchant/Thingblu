package thingblu.TestsCasesManager;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import thingblu.core.Config;
import thingblu.core.DataProviders;
import thingblu.utility.ReadPropertiesFile;

public class Mngr_VerifyAddNewSubBrand extends Config {

	@Test(dataProvider="ProductTypeData", dataProviderClass = DataProviders.class)
	public void addNewSubBrandAndValidateStatus(HashMap<String, String> sbData) throws Exception {
		
		etlogger = report.startTest("Verify Adding new subbrand");
		logInToApplicationAs("Manager");
		Thread.sleep(2000);
		navigation.clickOnAddNewSubBarndMenuItem();
		Thread.sleep(2000);
		mngr_subBrandMaster.selectBrandName(sbData.get("Brand"));
		mngr_subBrandMaster.enterSubBrandName(sbData.get("subBrand"));
		mngr_subBrandMaster.enterSubBrandDescription(sbData.get("Desc"));
		mngr_subBrandMaster.clickOnSaveBtn();
		Assert.assertEquals(mngr_subBrandMaster.getAlertMessagePopUpText(), ReadPropertiesFile.getDataFromProperties("saveSubBrand"), "Sub brand Not get successfully added.");
		System.out.println("Sub Brand Added Successfully");
		Thread.sleep(1000);
		mngr_subBrandMaster.searchAddedSubBrandInTable(sbData.get("Brand"), sbData.get("subBrand"));
		etlogger.log(LogStatus.PASS, "SubBrand is successfully added.");
		
	}
}
