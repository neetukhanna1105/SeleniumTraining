package common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest1 {
	private WebDriver driver = null;

	@BeforeEach
	void launchBrowser() throws Exception {
		setDriver(Configuration.createFireFoxDriver());
		getDriver().get(Configuration.ADMIN_URL);
		Thread.sleep(2000);
	}

	@AfterEach
	void closeBrowser() throws Exception {
		getDriver().quit();
	}

	protected WebDriver getDriver() {
		return driver;
	}
	
	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
