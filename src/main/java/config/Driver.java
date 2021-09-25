package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case CHROME:
				 System.setProperty("webdriver.chrome.driver",
				 "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				System.setProperty("webdriver.firefox.driver",
				"src/test/resources/drivers/firefoxdriver.exe");
				driver = new FirefoxDriver();
				break;
			}

		}
		
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}
	
}
