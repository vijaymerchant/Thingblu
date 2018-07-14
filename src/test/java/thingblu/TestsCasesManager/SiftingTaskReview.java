package thingblu.TestsCasesManager;

import org.testng.annotations.Test;

import thingblu.core.Config;

public class SiftingTaskReview extends Config{

	@Test
	public void VerifySiftingTaskreview() throws Exception{
		logInToApplicationAs("Manager");
		mngr_dashboard.mngrSelectTask("David Miller", "Sifting", "9LB Hammer", "1");
		mngr_dashboard.clcikOnButton("Review");
		Thread.sleep(5000);
		mngr_dashboard.enterSiftBudReviewWt("12");
		mngr_dashboard.enterSiftJointsReviewWt("10");
		mngr_dashboard.enterSiftOilReviewWt("15");
		mngr_dashboard.enterActualHrs("54");
		mngr_dashboard.enterActualMins("45");
		mngr_dashboard.enterTrimReviewComment("This is automation comment text for trommong task review.");
	}
}
