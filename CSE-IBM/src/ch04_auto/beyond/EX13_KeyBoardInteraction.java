package ch04_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest2;

class EX13_KeyBoardInteraction extends BaseTest2{

	/*
	 * Sending a sequence of keys with Keys Chord
	 */
	@Test
	void test01() {
		String title = "Sample";

		WebElement postTitle = getDriver().findElement(By.id("title"));
		postTitle.sendKeys(Keys.chord(Keys.SHIFT, title));

	}

	/*
	 * Holding and Releasing a key while other keystrokes are simulated
	 */
	@Test
	void test02() {
		String title = "Sample";
		WebElement postTitle = getDriver().findElement(By.id("title"));

		Actions actions = new Actions(getDriver());
		actions.keyDown(Keys.SHIFT).sendKeys(postTitle, title).keyUp(Keys.SHIFT).build().perform();

		assertEquals(title.toUpperCase(), postTitle.getAttribute("value"), "Assert upper case title");

	}

}