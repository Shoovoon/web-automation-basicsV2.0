package webautomationv1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	WebDriver driver;

	public void initializeDriver() {
		String browserName = System.getProperty("browser", "chrome");

		if (browserName.equals("chrome")) {
			// Code for Chrome
			System.out.println("Initializing Chrome driver...");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
			// Code for Firefox
			System.out.println("Initializing Firefox driver...");
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			// Code for other browsers or default behavior
			System.out.println("Initializing default driver...");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

}
