package thingblu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import thingblu.core.BasePage;

public class MenuNavigation extends BasePage {

	public MenuNavigation(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".menu>ul>li:nth-child(2)>div>a>span")
	WebElement newLot;
	
	@FindBy(css = ".menu>ul>li:nth-child(3)>div>a>span")
	WebElement lotList;
	
	@FindBy(css = ".menu>ul>li:nth-child(4)>div>a>span")
	WebElement order;
	
	@FindBy(css="a[ng-reflect-router-link='orderrequestform']>span")
	WebElement OrderRequestForm;
	
	@FindBy(css = ".menu>ul>li:nth-child(5)>div>a>span")
	WebElement task;
	
	@FindBy(css="a[ng-reflect-router-link='assigntask']>span")
	WebElement assigntask;
	
	@FindBy(css="span[ng-reflect-ng-class='fa-sign-out']+span")
	WebElement signOutLink;
	
	public void clickOnSignOut(){
		click(signOutLink);
	}
	
	public void getMenuText(){
		System.out.println("menu utem name is :" +OrderRequestForm.getText());
	}
	
	public void clickOnNewLOtMenuItem(){
		if (newLot.getText().equalsIgnoreCase("New Lot Entry")) {
			newLot.click();
		}
	}
	
	public void clickOnLotListMenuItem(String MenuName){
		if (lotList.getText().equalsIgnoreCase(MenuName)) {
			lotList.click();
		}
	}
	
	public void clickOnOrderMenuItem(){
		if (order.getText().equalsIgnoreCase("order")) {
			order.click();
		}
	}

	public void clickOnOrderFormMenuItem(){
		if (OrderRequestForm.getText().equalsIgnoreCase("Order Request Form")) {
			OrderRequestForm.click();
		}
	}
	
	public void clickOnTaskMenuItem(){
		if (task.getText().equalsIgnoreCase("Task")) {
			task.click();
		}
	}

	public void clickOnAssignTaskMenuItem(){
		if (assigntask.getText().equalsIgnoreCase("Assign Task")) {
			assigntask.click();
		}
	}
}
