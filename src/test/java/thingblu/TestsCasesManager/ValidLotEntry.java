package thingblu.TestsCasesManager;

import org.testng.annotations.Test;

import thingblu.core.Config;
import thingblu.core.DataProviders;

public class ValidLotEntry extends Config {
	
	@Test(dataProvider ="LotEntryData", dataProviderClass=DataProviders.class)
	public void verifyLotEntry(String growerName, String StrainName, String lotNo, String materialType, String transferWeight, String startWeight, String lotcost){
		navigation.clickOnNewLOtMenuItem("New Lot");
		lotEntryPage.selectGrower(growerName);
		lotEntryPage.selectStrain(StrainName);
		lotEntryPage.enterLotnumber(lotNo);
		lotEntryPage.selectLotType(materialType);
		lotEntryPage.enterLotTransferWgt(transferWeight);
		lotEntryPage.enterLotStartWgt(startWeight);
		lotEntryPage.enterLotCost(lotcost);
		lotEntryPage.clickOnSaveBtn();
	}

}
