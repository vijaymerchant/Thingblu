package thingblu.TestsCasesManager;

import org.testng.annotations.Test;

import thingblu.core.Config;

public class CompleteTask extends Config {

	@Test(groups="Trimming")
	public void getStatusTablist() throws Exception{
		logInToApplicationAs("Employee");
		emp_dashboard.listOfAllStatusTabsEmp();
		emp_dashboard.clickOnStatusTab("07/12/18");
		emp_dashboard.empSelectTask("Trimming", "3-Pac", "78", "ASSIGNED");
	}
}
