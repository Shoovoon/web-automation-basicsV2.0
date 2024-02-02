package webautomationv1;

import org.testng.annotations.Test;

public class firstAutomation extends BaseDriver{
	String url = "http://aims.baf.org/";
	
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}

}
