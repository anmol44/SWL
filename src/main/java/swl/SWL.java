package swl;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.SWLPage;

public class SWL extends BaseTest {
	
	String url = "https://apps.powerapps.com/play/e/default-8b87af7d-8647-4dc7-8df4-5f69a2011bb5/a/93ee28a6-cd72-4ccb-b436-5c94629c11a9?tenantId=8b87af7d-8647-4dc7-8df4-5f69a2011bb5&hidenavbar=true&skipAppMetadata=false";

	@Test
	public void fill_SWL() throws InterruptedException {
		SWLPage swlPage = new SWLPage(driver);
		Thread.sleep(2000);
		swlPage
		.load(url)
		.clickStart()
		.employeeLocalization()
		.spinnerWait()
		.selectWorkType()
		.locationInSWL(driver)
		.nextPageAfterDataFill(driver)
		.howIAmFeelingThisWeek()
		.nextPageAfterHealthAndFeeling()
		.submit()
		;
	}
}
