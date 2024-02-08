package webautomationv1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locationExample extends BaseDriver {

	String url = "http://aims.baf.org";

	@Test
	public void locationTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		
//		to store : webelement
		
		
//		locate by ID
		WebElement priMenu = driver.findElement(By.id("service_number"));
		priMenu.click();
		priMenu.sendKeys("Support17104");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
//		driver.findElement(By.xpath("//b[contains(text(),'Forgot Password')]")).click();
		Thread.sleep(10000); 
		
	}

}
