package thingblu.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import thingblu.core.BasePage;

public class OrderEntryForm extends BasePage {

	public OrderEntryForm(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="retailers")
	WebElement retailerDrpDwn;
	
	@FindAll({ @FindBy(css="#retailers>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> retlrName;
	
	@FindBy(id="deliverydate")
	WebElement clickClndr;
	
	@FindAll({ @FindBy(css="table.ui-datepicker-calendar>tbody>tr")})
	List <WebElement> clndrDateRows;
	
	@FindAll({ @FindBy(css="table.ui-datepicker-calendar>tbody>tr>td>a")})
	List <WebElement> clndrDates;
	
	@FindBy(id="orderrefid")
	WebElement OrderIdInput;
	
	@FindBy(css="div[formarrayname='aBudItems']>a")
	WebElement budplusIcon;
	
	@FindBy(css="div=[formarrayname='aBudItems']>div>div:nth-child(2)>div>div>p-dropdown>div>div:nth-child(4)>div:nth-child(2)>ul>li>span")
	WebElement s;
	
	@FindBy(css="p-fieldset[legend='B Joints Order Details']>fieldset>div>div>div>a")
	WebElement jointsplusIcon;
	
	public void selectRetailerName(String retailerName){
		selectItemFromDrpDwn(retailerDrpDwn, retlrName, retailerName);
	}

	public void clickOnCalander(String date){
		click(clickClndr);
		for (int i = 1; i < clndrDates.size(); i++) {
			if (clndrDates.get(i).getText().equalsIgnoreCase(date)) {
				clndrDates.get(i).click();	
				break;
			}
		}
	}
	
	public void enterS2OrderID(String s2OrderID){
		enterData(OrderIdInput, s2OrderID);
	}

	public void clickOnBudPlusIcon(){
		click(budplusIcon);
	}
	
	public void clickOnJointsPlusIcon(){
		click(jointsplusIcon);
	}
	
}
