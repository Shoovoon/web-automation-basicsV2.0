package webautomationv1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class locatorExampleNopCommerce extends BaseDriver {

    String nopComURL = "https://demo.nopcommerce.com/";

    @Test
    public void locationTest() throws InterruptedException {

        driver.get(nopComURL);
        driver.manage().window().maximize();

        // Perform your actions here
        driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
        
        driver.findElement(By.xpath("//button[@type='button' and @class='button-1 register-button']")).click();
        Thread.sleep(10000);
    }
}
