package webautomationv1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class locationExample extends BaseDriver {

//	String url = "http://aims.baf.org";
	String url = "https://demo.nopcommerce.com/";
	
	
	@Test
	public void locationTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		
//		to store : webelement
		
//Practice Site: AIMS:
		
		
////		locate by ID
//		WebElement priMenu = driver.findElement(By.id("service_number"));
//		priMenu.click();  //clicks on link with desired ID
//		priMenu.sendKeys("Support17104");  //to sent value
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
////		driver.findElement(By.xpath("//b[contains(text(),'Forgot Password')]")).click();
//		Thread.sleep(10000); 
		
		
		
//Practice Site: NopCommerce
		
//		locate by ID
		
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	
//	bY nAME
		
		WebElement emailID = driver.findElement(By.name("Email"));
		emailID.sendKeys("email@email.com");
		Thread.sleep(5000);
		
		
// by LinkText:
		
		WebElement forgetPass = driver.findElement(By.linkText("Forgot password?"));
		forgetPass.click();
		Thread.sleep(5000);

		
//		by PartialLinkText
		
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Gift"));
		partialLinkText.click();
		Thread.sleep(10000);
		
		
		
	}

}
