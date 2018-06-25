package thingblu.TestsCasesManager;

import org.testng.Assert;
import org.testng.annotations.Test;


import thingblu.core.Config;
import thingblu.core.DataProviders;
import thingblu.utility.ReadPropertiesFile;

public class GrindingTask extends Config {

	@Test(dataProvider="GrindingTaskData" , dataProviderClass=DataProviders.class)
	public void verifyAssignTrimmingTask(String taskName,String lotNo, String Emp, String assignWt, String stDate, String priority, String comment, String notiCheckManager,String notiCheckEmp ) throws Exception {
		navigation.clickOnTaskMenuItem();
		Thread.sleep(2000);
		navigation.clickOnAssignTaskMenuItem();
		assignTaskPage.selectTask(taskName);
		Thread.sleep(5000);
		assignTaskPage.selectLotNumber(lotNo);
		assignTaskPage.selectEmployee(Emp);
		assignTaskPage.enterAssignwt(assignWt);
		assignTaskPage.selectStartDate(stDate);
		assignTaskPage.selectTaskPriority(priority);
		assignTaskPage.enterTaskComment(comment);
		assignTaskPage.notifyChkBx(notiCheckManager, "Notify Manager");
		assignTaskPage.notifyChkBx(notiCheckEmp, "Notify Employee");
		assignTaskPage.clickOnAssignTaskBtn();
		Assert.assertEquals(assignTaskPage.getAlertMessagePopUpText(), ReadPropertiesFile.getDataFromProperties("successfulTaskAssign"));
		System.out.println("Task is successfully assigned.");
	}
}