package thingblu.core;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	 public WebDriver driver;
	 public WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 60);
	}
	
	public void jsExecutor(String action, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript(action, element);
	}
	
	/**
	 * To click on web element
	 * @param element
	 */
	public void click( WebElement element){
		element.click();
	}
	
	/**
	 * To click on element. clear present text and enter data into it.
	 * @param element
	 * @param dataName
	 */
	public void enterData(WebElement element, String dataName){
		element.clear();
		element.sendKeys(dataName);
	}

	public void selectItemFromDrpDwn(WebElement eleToClick,List<WebElement> drpDwnList, String itemName){
		click(eleToClick);
		for (int i = 1; i < drpDwnList.size(); i++) {
			if (drpDwnList.get(i).getText().equalsIgnoreCase(itemName)) {
				drpDwnList.get(i).click();
				break;
			}
		}
	}
	
	public void selectItemFromDrpDwnOrder(WebElement eleToClick,List<WebElement> drpDwnList, String itemName){
		click(eleToClick);
		for (int i = 1; i < drpDwnList.size(); i++) {
			if (drpDwnList.get(i).getText().equalsIgnoreCase(itemName)) {
				drpDwnList.get(i).click();
				break;
			}
		}
	}
	
	public void checkCheckboxStatusAndSelect(String desiredStatus, List<WebElement> listEle, String checkboxName) {
		if (desiredStatus.equalsIgnoreCase("check")) {
			for (int i = 0; i < listEle.size(); i++) {
				if (listEle.get(i).getText().equalsIgnoreCase(checkboxName)) {
					listEle.get(i).click();
					break;
				} else {
					System.out.println(checkboxName + " checkbox not found");
				}
			}
		}

		else {
			System.out.println("checkbox is default unchecked.");
		}
	}
	
	public void waitTime() {
		try {
			driver.wait(400);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void visibility(WebElement ele) {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOf(ele));
	}

	public void clickable(WebElement ele) {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void drpDwnselectValueByValue(WebElement ele, String value){
		visibility(ele);
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	
	public void drpDwnselectValueByVisibleText(WebElement ele, String value){
		visibility(ele);
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}
	
	
}