package ch3_1_auto.page;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class EX03_VerifyTitleFail {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Configuration.createFireFoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();
			if (!expectedTitle.equals(actualTitle)) {
				throw new Exception(String
						.format("Failure: Title does not match. Expected: <%s> Actual: <%s>" ,
								expectedTitle, 
								actualTitle));
		}
			driver.quit();
		}
	}
