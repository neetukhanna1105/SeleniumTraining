package ch03_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class EX03UsingOtherSimpleTechniques extends BaseTest1 {

	/*
	 * Identify UserName by Name
	 */
	@Test
	void test01() {
		WebElement userNameTextField = getDriver().findElement(By.name("log"));
		System.out.println(userNameTextField);
	}

	/*
	 * Identify UserName by ID
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.id("user_login"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify UserName by tagName
	 */
	@Test
	void test03() {
		WebElement element = getDriver().findElement(By.tagName("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify UserName by className
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.className("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify Submit Button by className - using one class from multiple
	 */
	@Test
	void test05() {
		WebElement element = getDriver().findElement(By.className("button-large"));
		SeleniumUtils.printElementInfo("Submit Button", element);
	}
	
}
