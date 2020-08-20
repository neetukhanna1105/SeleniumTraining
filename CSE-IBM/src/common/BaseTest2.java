package common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest2 {

	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	void login() throws Exception {
		setDriver(Configuration.createFireFoxDriver());
		wait = new WebDriverWait(getDriver(), 60);

		getDriver().get(Configuration.ADMIN_URL);

		WebElement userTextBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("log")));
		userTextBox.sendKeys(Configuration.USER_NAME);
		assertEquals(Configuration.USER_NAME, userTextBox.getAttribute("value"), "Assert the user name text");

		WebElement pwdTextBox = driver.findElement(By.name("pwd"));
		pwdTextBox.sendKeys(Configuration.PASSWORD);
		assertEquals(Configuration.PASSWORD, pwdTextBox.getAttribute("value"), "Assert the password text");
		pwdTextBox.submit();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpadminbar")));

	}

	@AfterEach
	void logOut() throws Exception {
		WebElement logOut = driver.findElement(By.xpath("//*[text()='Log Out']"));
		driver.get(logOut.getAttribute("href"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'logged out')]")));

		getDriver().quit();
	}

	protected WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	protected WebDriverWait getWaiter() {
		return this.wait;
	}

}