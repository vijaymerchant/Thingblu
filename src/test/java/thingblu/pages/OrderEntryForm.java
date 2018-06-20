package thingblu.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import thingblu.core.BasePage;

public class OrderEntryForm extends BasePage {

	public OrderEntryForm(WebDriver driver) {
		super(driver);
	}
	
	int i;
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
	
	@FindBy(css="button[label='Save']")
	WebElement clickOnSaveButton;
	
	// Bud Order table objects
	@FindBy(css="div[formarrayname='aBudItems']>a")
	WebElement budplusIcon;
	
	@FindBy(css="div[formarrayname='aBudItems']>div>div:nth-child(2)>div>div:nth-child(8)>a.copybtn")
	WebElement budOrderItemcopy;
	
	@FindBy(css="div[formarrayname='aBudItems']>div>div:nth-child(2)>div>div:nth-child(8)>a:nth-child(3)")
	WebElement budOrderDeleteItem;
	
	// Joints order table objects
	@FindBy(css="p-fieldset[legend='B Joints Order Details']>fieldset>div>div>div>a")
	WebElement jointsplusIcon;
	
	@FindBy(id="bbrand")
	WebElement clickOnJointsBrand;
	@FindAll({ @FindBy(css="#bbrand>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> jointsBrandList;
	
	@FindBy(id="bsubbrand")
	WebElement clickOnJointsSubBrand;
	@FindAll({ @FindBy(css="#bsubbrand>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> jointsSubBrandList;
	
	@FindBy(id="bstrain")
	WebElement clickOnjointsStrain;
	@FindAll({ @FindBy(css="#bstrain>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> jointsStrainList;
	
	@FindBy(id="bpkgtype")
	WebElement clickOnJointsPackType;
	@FindAll({ @FindBy(css="#bpkgtype>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> jointsPackTypeList;
	
	@FindBy(id="bpkgsize")
	WebElement clickOnJointsPackSize;
	@FindAll({ @FindBy(css="#bpkgsize>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> jointsPackSizeList;
	
	@FindBy(id="bitemqty")
	WebElement clickOnJointsPackItemQty;
	@FindAll({ @FindBy(css="#bitemqty>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> jointsPackItemQtyList;
	
	@FindBy(css="#borderqty>")
	WebElement jointsOrderQty;
	
	@FindBy(css="div[formarrayname='bJointsItems']>div>div:nth-child(2)>div>div:nth-child(8)>a.copybtn")
	WebElement jointsOrderItemcopy;
	
	@FindBy(css="div[formarrayname='bJointsItems']>div>div:nth-child(2)>div>div:nth-child(8)>a:nth-child(3)")
	WebElement jointsOrderDeleteItem;
	
	// Oil order table objects
	@FindBy(css="div[formarrayname='cOilItems']>a")
	WebElement oilplusIcon;
	
	@FindBy(id="cbrand")
	WebElement clickOnOilBrand;
	@FindAll({ @FindBy(css="#cbrand>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> oilBrandList;
	
	@FindBy(id="csubbrand")
	WebElement clickOnOilSubBrand;
	@FindAll({ @FindBy(css="#csubbrand>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> oilSubBrandList;
	
	@FindBy(id="cstrain")
	WebElement clickOnOilStrain;
	@FindAll({ @FindBy(css="#cstrain>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> oilStrainList;
	
	@FindBy(id="cpkgtype")
	WebElement clickOnOilPackType;
	@FindAll({ @FindBy(css="#cpkgtype>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> oilPackTypeList;
	
	@FindBy(id="cpkgsize")
	WebElement clickOnOilPackSize;
	@FindAll({ @FindBy(css="#cpkgsize>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> oilPackSizeList;
	
	@FindBy(id="citemqty")
	WebElement clickOnOilPackItemQty;
	@FindAll({ @FindBy(css="#citemqty>div>div:nth-child(5)>div:nth-child(2)>ul>li>span")})
	List <WebElement> oilPackItemQtyList;
	
	@FindBy(css="#corderqty>")
	WebElement oilOrderQty;
	
	@FindBy(css="div[formarrayname='cOilItems']>div>div:nth-child(2)>div>div:nth-child(8)>a.copybtn")
	WebElement oilOrderItemcopy;
	
	@FindBy(css="div[formarrayname='cOilItems']>div>div:nth-child(2)>div>div:nth-child(8)>a:nth-child(3)")
	WebElement oilOrderDeleteItem;

	
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
	
	public void clickOnOilPlusIcon(){
		click(oilplusIcon);
	}

	public void clickonbrand(){
		WebElement clickOnBudBrand=	driver.findElement(By.cssSelector("div>form>p-fieldset:nth-child(4)>fieldset>div:nth-child(2)>div>div>div>div:nth-child(2)>div>div>p-dropdown"));
		clickOnBudBrand.click();
	}
	public void selectBudBrand(String budBrandName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudBrand=	driver.findElement(By.cssSelector("div>form>p-fieldset:nth-child(4)>fieldset>div:nth-child(2)>div>div>div>div:nth-child(2)>div>div>p-dropdown"));
			clickOnBudBrand.click();
			Thread.sleep(1000);
			String rowinterator = "div>form>p-fieldset:nth-child(4)>fieldset>div:nth-child(2)>div>div>div>div:nth-child(2)>div>div>p-dropdown>div>div:nth-child(4)>div:nth-child(2)>ul>li>span";
			List<WebElement> budBrandList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budBrandList.size(); i++) {
					if (budBrandList.get(i).getText().equalsIgnoreCase(budBrandName)) {
						budBrandList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectBudSubBrand(String budSubBrandName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnSubBudBrand=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='asubbrand']"));
			clickOnSubBudBrand.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='asubbrand']>div>div:nth-child(4)>div:nth-child(2)>ul>li>span";
			List<WebElement> budSubBrandList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budSubBrandList.size(); i++) {
					if (budSubBrandList.get(i).getText().equalsIgnoreCase(budSubBrandName)) {
						budSubBrandList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	
	public void selectBudStrain(String budStrainName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudStrain=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='astrain']"));
			clickOnBudStrain.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='astrain']>div>div:nth-child(4)>div:nth-child(2)>ul>li>span";
			List<WebElement> budStrainList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budStrainList.size(); i++) {
					if (budStrainList.get(i).getText().equalsIgnoreCase(budStrainName)) {
						budStrainList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectBudPackageType(String budPackName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudPackType=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='apkgtype']"));
			clickOnBudPackType.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='apkgtype']>div>div:nth-child(4)>div>ul>li>span";
			List<WebElement> budPackTypeList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budPackTypeList.size(); i++) {
					if (budPackTypeList.get(i).getText().equalsIgnoreCase(budPackName)) {
						budPackTypeList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectBudPackageSize(String budPackSizeName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudPackSize=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='apkgsize']"));
			clickOnBudPackSize.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='apkgsize']>div>div:nth-child(4)>div>ul>li>span";
			List<WebElement> budPackSizeList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budPackSizeList.size(); i++) {
					if (budPackSizeList.get(i).getText().equalsIgnoreCase(budPackSizeName)) {
						budPackSizeList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectBudPackageItemQty(String budPackItemQty, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudPackItemQty=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='aitemqty']"));
			clickOnBudPackItemQty.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='aitemqty']>div>div:nth-child(4)>div>ul>li>span";
			List<WebElement> budPackItemQtyList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budPackItemQtyList.size(); i++) {
					if (budPackItemQtyList.get(i).getText().equalsIgnoreCase(budPackItemQty)) {
						budPackItemQtyList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void enterOrderQty(String orderQnty, int rowNo) throws Exception {
		for (int j = rowNo; j > 0; ) {
			WebElement clickOnBudPackItemQty=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div:nth-child(7)>input"));
			clickOnBudPackItemQty.click();
			clickOnBudPackItemQty.sendKeys(orderQnty);
			break;
		}
	}
	
	
	public void clickOnJointsPlusIcon(){
		click(jointsplusIcon);
	}
	
	public void selectJointsBrand(String jointsBrandName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnJointsBrand=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='bbrand']"));
			clickOnJointsBrand.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='bbrand']>div>div:nth-child(4)>div:nth-child(2)>ul>li>span";
			List<WebElement> jointsBrandList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < jointsBrandList.size(); i++) {
					if (jointsBrandList.get(i).getText().equalsIgnoreCase(jointsBrandName)) {
						jointsBrandList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectJointsSubBrand(String budSubBrandName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnSubBudBrand=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='asubbrand']"));
			clickOnSubBudBrand.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='asubbrand']>div>div:nth-child(4)>div:nth-child(2)>ul>li>span";
			List<WebElement> budSubBrandList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budSubBrandList.size(); i++) {
					if (budSubBrandList.get(i).getText().equalsIgnoreCase(budSubBrandName)) {
						budSubBrandList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	
	public void selectJointsStrain(String budStrainName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudStrain=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='astrain']"));
			clickOnBudStrain.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='astrain']>div>div:nth-child(4)>div:nth-child(2)>ul>li>span";
			List<WebElement> budStrainList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budStrainList.size(); i++) {
					if (budStrainList.get(i).getText().equalsIgnoreCase(budStrainName)) {
						budStrainList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectJointsPackageType(String budPackName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudPackType=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='apkgtype']"));
			clickOnBudPackType.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='apkgtype']>div>div:nth-child(4)>div>ul>li>span";
			List<WebElement> budPackTypeList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budPackTypeList.size(); i++) {
					if (budPackTypeList.get(i).getText().equalsIgnoreCase(budPackName)) {
						budPackTypeList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectJointsPackageSize(String budPackSizeName, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudPackSize=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='apkgsize']"));
			clickOnBudPackSize.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='apkgsize']>div>div:nth-child(4)>div>ul>li>span";
			List<WebElement> budPackSizeList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budPackSizeList.size(); i++) {
					if (budPackSizeList.get(i).getText().equalsIgnoreCase(budPackSizeName)) {
						budPackSizeList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void selectJointsPackageItemQty(String budPackItemQty, int rowNo) throws Exception {
		for (int j = rowNo; j > 0;) {
			WebElement clickOnBudPackItemQty=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div>p-dropdown[id='aitemqty']"));
			clickOnBudPackItemQty.click();
			Thread.sleep(1000);
			String rowinterator = "div:nth-child("+j+")>div>div>p-dropdown[id='aitemqty']>div>div:nth-child(4)>div>ul>li>span";
			List<WebElement> budPackItemQtyList = driver.findElements(By.cssSelector(rowinterator));
				for (int i = 1; i < budPackItemQtyList.size(); i++) {
					if (budPackItemQtyList.get(i).getText().equalsIgnoreCase(budPackItemQty)) {
						budPackItemQtyList.get(i).click();
						break;
				}
			}
				break;
		}
	}
	
	public void enterJointsOrderQty(String orderQnty, int rowNo) throws Exception {
		for (int j = rowNo; j > 0; ) {
			WebElement clickOnBudPackItemQty=	driver.findElement(By.cssSelector("div:nth-child("+j+")>div>div:nth-child(7)>input"));
			clickOnBudPackItemQty.click();
			clickOnBudPackItemQty.sendKeys(orderQnty);
			break;
		}
	}
	
}
