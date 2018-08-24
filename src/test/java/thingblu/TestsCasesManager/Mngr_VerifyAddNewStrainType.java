package thingblu.TestsCasesManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import thingblu.core.Config;
import thingblu.utility.ReadPropertiesFile;

public class Mngr_VerifyAddNewStrainType extends Config {

	@Test
	public void addNewStrainTypeAndValidateStatus() throws Exception {
		logInToApplicationAs("Manager");
		navigation.clickOnAddStrainTypeMenuItem();
		Thread.sleep(1000);
		mngr_strainTypeMaster.enterStrainTypeName("123456");
		mngr_strainTypeMaster.enterStrainTypeDescription("123456");
		mngr_strainTypeMaster.clickOnSaveBtn();
		Assert.assertEquals(mngr_strainTypeMaster.getAlertMessagePopUpText(), ReadPropertiesFile.getDataFromProperties("saveStrainType"), "Starin Type not get successfully added.");
		System.out.println("Strain Type Added Successfully");
		Thread.sleep(1000);
		mngr_strainTypeMaster.searchAddedStrainTypeInTable("123456");
	}
}
