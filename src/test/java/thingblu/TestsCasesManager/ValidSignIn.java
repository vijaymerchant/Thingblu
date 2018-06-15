package thingblu.TestsCasesManager;

import org.testng.annotations.Test;

import thingblu.core.Config;

public class ValidSignIn extends Config {

	@Test
	public void signInWithValidCredentials() throws Exception{
		signIn.setUsername("th!ngblu");
		signIn.setPassword("123456");
		signIn.ClickSignInBtn();
		navigation.clickOnOrderMenuItem("order");
		Thread.sleep(4000);
		navigation.clickOnOrderFormMenuItem("Order Request Form");
		orderEntryPage.selectRetailerName("Cokin");
		orderEntryPage.clickOnCalander("18");
	}
}
