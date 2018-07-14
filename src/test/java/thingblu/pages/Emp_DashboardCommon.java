package thingblu.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import thingblu.core.BasePage;

public class Emp_DashboardCommon extends BasePage{

	public Emp_DashboardCommon(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="app-employeedashboard > div> h1>span")
	WebElement sectionTitle;
	
	@FindAll ({@FindBy(css="li[role='presentation'] > a > span:nth-child(2)")})
	List<WebElement> statusTabs;
	
	@FindBy(css="ul[role='tablist']>li:nth-child(1)")
	WebElement todaysTask;
	
	@FindBy(css="ul[role='tablist']>li:nth-child(2)")
	WebElement inProcessOrPausedTask;
	
	@FindBy(css="ul[role='tablist']>li:nth-child(3)")
	WebElement delayedTask;
	
	@FindBy(css="ul[role='tablist']>li:nth-child(4)")
	WebElement futureTask;
	
	@FindBy(css="ul[role='tablist']>li:nth-child(5)")
	WebElement completedtask;
	
	@FindBy(css="button[label='Start Task']")
	WebElement startEmpTaskButton;
	
	@FindBy(css="button[label='Pause']")
	WebElement puaseEmpTaskButton;
	
	@FindBy(css="button[label='Complete']")
	WebElement completeEmpTaskButton;
	
	
	
	public void listOfAllStatusTabsEmp(){
		for (int i = 0; i < statusTabs.size(); i++) {
			System.out.println(statusTabs.get(i).getText());
		}
	}
	
	
	public void clickOnStatusTab(String taskStartDate) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
		Date date = new Date();  
	    String currentDate= sdf.format(date);
        Date cDate = sdf.parse(currentDate);
        Date tDate = sdf.parse(taskStartDate);
        
        if (tDate.after(cDate)) {
        	futureTask.click();
        	System.out.println("clicked on furture task");
        }

        if (tDate.before(cDate)) {
        	delayedTask.click();
        	System.out.println("clicked on delayed task");
        }

        if (tDate.equals(cDate)) {
        	todaysTask.click();
        	System.out.println("clicked on todays task");
        }

    }

	@FindAll ({ @FindBy(css="p-tabpanel[header^='Today']>div>p-table>div>div:nth-child(2)>table>tbody>tr")})
	List<WebElement> tableRows;
	
	public void empSelectTaskWithTaskandStatus(String task, String status){
		for (int i = 1; i <tableRows.size()+1; i++) {
			WebElement taskname=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(1)>u>a"));
			WebElement statusName=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(5)"));

			if (taskname.getText().equalsIgnoreCase(task) && statusName.getText().equalsIgnoreCase(status)) {
				click(taskname);
				break;
			}

		}
	}
	
	
	public void empSelectTask(String task, String grower, String lot, String status){
		for (int i = 1; i <tableRows.size()+1; i++) {
			WebElement taskname=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(1)>u>a"));
			WebElement growerName=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(2)"));
		//  WebElement starinName=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(3)"));
			WebElement lotNumber=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(4)"));
			WebElement statusName=driver.findElement(By.cssSelector("p-table[ng-reflect-global-filter-fields='TaskTypeName,GrowerName,Strain']>div>div:nth-child(2)>table>tbody>tr:nth-child("+i+")>td:nth-child(5)"));
	
			if (taskname.getText().equalsIgnoreCase(task) && growerName.getText().equalsIgnoreCase(grower)
					&& lotNumber.getText().equalsIgnoreCase(lot) && statusName.getText().equalsIgnoreCase(status)) {

				click(taskname);
				break;
			}

		}
	}

	public void clcikOnButton(String ActionName) {
		switch (ActionName) {
		case "Start":
			click(startEmpTaskButton);
			break;

		case "Pause":
			click(puaseEmpTaskButton);
			break;

		case "Complete":
			click(completeEmpTaskButton);
			break;

		default:
			System.out.println("Task is completed");
		}
	}

}
