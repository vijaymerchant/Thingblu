package thingblu.TestsCasesManager;

import org.testng.annotations.Test;

import thingblu.core.Config;

public class AssignABudPackagingBrandingTask extends Config {

	@Test
	public void verifyAssignGrindingTask() throws Exception {
		navigation.clickOnTaskMenuItem();
		Thread.sleep(2000);
		navigation.clickOnAssignTaskMenuItem();
		assignTaskPage.selectTask("A Bud Packaging & Branding");
		Thread.sleep(5000);
		assignTaskPage.selectS2OrderID("S-00045");
		Thread.sleep(5000);
		assignTaskPage.getOrderData();
		assignTaskPage.enterOrderItemQuantity("12");
	}
}