package webautomationv1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

public class firstAutomation extends BaseDriver {
	String url = "http://aims.baf.org/";

	@Test
	public void openUrl() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//b[contains(text(),'Forgot Password')]")).click();
	}

}
