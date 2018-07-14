package thingblu.TestsCasesManager;

import org.testng.annotations.Test;

import thingblu.core.Config;

public class ReviewTrimmingTask extends Config{
	
	@Test
	public void verifyReviewtrimmingTask(){
		logInToApplicationAs("Manager");
		mngr_dashboard.mngrSelectTask("David Miller", "Trimming", "3-Pac", "03321");
		mngr_dashboard.clcikOnButton("Review");
		mngr_dashboard.enterTrimBudReviewWt("10");
		mngr_dashboard.enterTrimOilReviewWt("0");
		mngr_dashboard.enterTrimWasteReviewWt("0");
		mngr_dashboard.enterActualHrs("10");
		mngr_dashboard.enterActualMins("15");
		mngr_dashboard.enterTrimReviewComment("This is automation comment text for trommong task review.");
	}
}
