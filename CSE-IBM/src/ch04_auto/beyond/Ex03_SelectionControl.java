package ch04_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest2;

class Ex03_SelectionControl extends BaseTest2 {

	/*
	 * Handling a drop down with clicks
	 */
	@Test
	void test01() {
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

		WebElement rawDropDown = this.getDriver().findElement(By.id("start_of_week"));
		rawDropDown.click();
		String expectedDay = "Monday";
		String xFinder = String.format("//option[text()='%s']", expectedDay);
		WebElement option = getDriver().findElement(By.xpath(xFinder));
		option.click();

		assertTrue(option.isSelected(), "Assert Monday is selected as start of the week");

	}

	/*
	 * Handling a DropDown list SendKeys
	 */
	@Test
	void test02() {
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

		WebElement rawDropDown = this.getDriver().findElement(By.id("start_of_week"));
		String expectedDay = "Monday";

		rawDropDown.sendKeys(expectedDay);

		String xFinder = String.format("//option[text()='%s']", expectedDay);
		WebElement option = getDriver().findElement(By.xpath(xFinder));
		assertTrue(option.isSelected(), "Assert Monday is selected as start of the week");

	}

	/*
	 * Handling a DropDown list as a Select Control
	 */
	@Test
	void test03() {
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

		String expectedDay = "Monday";

		Select weekStart = new Select(getDriver().findElement(By.id("start_of_week")));
		weekStart.selectByVisibleText(expectedDay);

		String actualDay = weekStart.getFirstSelectedOption().getText();

		assertEquals(expectedDay, actualDay, "Assert selected start of the week");

	}

}
