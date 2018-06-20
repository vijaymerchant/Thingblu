package thingblu.TestsCasesManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;
import thingblu.core.Config;
import thingblu.utility.ExcelReader;

public class ValidSignIn extends Config {
	public  int Rowcount;

/*	@Test(dataProvider ="Apackdata")
	public void signInWithValidCredentials(String brand, String subBrand, String strain, String packType, String packSize, String packQty, String orderItemQty) throws Exception{
		
//		orderEntryPage.selectRetailerName("Cokin");
//		orderEntryPage.clickOnCalander("18");
//		orderEntryPage.enterS2OrderID("989899");
		orderEntryPage.clickOnBudPlusIcon();
		orderEntryPage.selectBudBrand(brand,Rowcount);
		orderEntryPage.selectBudSubBrand(subBrand,Rowcount);
		orderEntryPage.selectBudStrain(strain,Rowcount);
		orderEntryPage.selectBudPackageType(packType,Rowcount);
		orderEntryPage.selectBudPackageSize(packSize,Rowcount);
		orderEntryPage.selectBudPackageItemQty(packQty,Rowcount);
		orderEntryPage.enterOrderQty(orderItemQty,Rowcount);
	}*/
	
	@Test
	public void signInWithValidCredentials() throws Exception{
		Rowcount++;
		//orderEntryPage.clickOnBudPlusIcon();
		//orderEntryPage.clickOnJointsPlusIcon();
		orderEntryPage.clickOnOilPlusIcon();
		orderEntryPage.selectBudBrand("Western Culture",Rowcount);
	}
	
	@DataProvider(name="Apackdata")
	public Object[][] orderBudData() throws BiffException, Exception{
		Object[][] arrayObject =ExcelReader.getExcelData("D:\\somanath\\AutomationData\\Thingblu-Testdata\\classSequenceData.xls", "Sheet1");
		return arrayObject;
	}
}
