package thingblu.TestsCasesManager;

import thingblu.core.Config;

public class ValidLotEntry extends Config {
	
	public void verifyLotEntry(){
		navigation.clickOnNewLOtMenuItem("New Lot");
		lotEntryPage.selectGrower("Dawg star");
		lotEntryPage.selectStrain("3-Pac");
		lotEntryPage.enterLotnumber("123456");
		lotEntryPage.selectLotType("Bud Material");
		lotEntryPage.enterLotTransferWgt("5050");
		lotEntryPage.enterLotStartWgt("500");
		lotEntryPage.enterLotCost("6758");
		lotEntryPage.clickOnSaveBtn();
	}

}
