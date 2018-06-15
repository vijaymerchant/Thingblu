package thingblu.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import thingblu.core.BasePage;

public class LotEntry extends BasePage{

	public LotEntry(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="grower")
	WebElement growserDrpDwn;
	@FindAll({ @FindBy(css="#grower>div>div:nth-child(4)>div>ul>li>span") })
	List<WebElement> growerList;
	
	@FindBy(id="strain")
	WebElement strainDrpDwn;
	@FindAll({@FindBy(css="#strain>div>div:nth-child(4)>div:nth-child(2)>ul>li>span") })
	List<WebElement> strainList;

	@FindBy(id="growerlotno")
	WebElement growerLotNo;
	
	@FindBy(id="lottype")
	WebElement lotTypeDrpDwn;
	@FindAll({ @FindBy(css="#lottype>div>div:nth-child(4)>div>ul>li>span")})
	List<WebElement> lotTypeList;
	
	@FindBy(id="biotrweight")
	WebElement transferWeight;
	
	@FindBy(id="startweight")
	WebElement startWeight;
	
	@FindBy(id="costoflot")
	WebElement lotCost;
	
	@FindBy(id="shortOverWeight")
	WebElement shortOverWeight;
	
	@FindBy(css="p-dropdown=[formcontrolname='trimmed']")
	WebElement isTrimmed;
	@FindAll({ @FindBy(css="p-dropdown=[formcontrolname='trimmed']>div>div:nth-child(4)>div>ul>li>span") })
	List<WebElement> isTrimmedList;
	
	@FindBy(id="btnLotSave")
	WebElement saveBtn;
	
	
	public void selectGrower(String growerName){
		selectItemFromDrpDwn(growserDrpDwn, growerList, growerName);
	}
	
	public void selectStrain(String strainName){
		selectItemFromDrpDwn(strainDrpDwn, strainList, strainName);
	}
	
	public void enterLotnumber(String lotNumber){
		enterData(growerLotNo,lotNumber);
	}

	public void selectLotType(String lotTypeName){
		selectItemFromDrpDwn(lotTypeDrpDwn, lotTypeList, lotTypeName);
	}
	
	public void enterLotTransferWgt(String lotTransferWgt){
		enterData(transferWeight,lotTransferWgt);
	}
	
	public void enterLotStartWgt(String lotStartWgt){
		enterData(startWeight,lotStartWgt);
	}
	
	public void enterLotCost(String lotCostAmmount){
		enterData(lotCost,lotCostAmmount);
	}
	
	public void selectIsTrimmedOption(String isTrimmedName){
		selectItemFromDrpDwn(isTrimmed, isTrimmedList, isTrimmedName);
	}
	
	public void clickOnSaveBtn(){
		click(saveBtn);
	}
	
	

}
