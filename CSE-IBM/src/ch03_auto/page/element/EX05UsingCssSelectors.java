package ch03_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class EX05UsingCssSelectors extends BaseTest1{

	
	/*
	 * Identify User Name text field using CSS Selector (Tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.cssSelector("input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
		
	}	
	/*
	 * Identify User Name text field using CSS Selector (Tag name and a given attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
		
	}
	/*
	 * Identify Password text field using CSS Selector (Tag name and a given attribute and value)
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
		
	}
	/*
	 * Identify User name text field using CSS Selector (ID)
	 * variant of test03
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id='user_login']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using CSS Selector (class)
	 * variant of test03
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[class='input']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using CSS Selector (class)
	 * variant of test03
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using CSS Selector - Special Symbols (# means ID)
	 */
	@Test
	void test04_01() {
		WebElement element = getDriver().findElement(By.cssSelector("#user_login"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using CSS Selector - Special Symbols (. means class)
	 */
	@Test
	void test04_02() {
		WebElement element = getDriver().findElement(By.cssSelector(".input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using CSS Selector - Special Symbols (* to mean any tag)
	 */
	@Test
	void test04_03() {
		WebElement element = getDriver().findElement(By.cssSelector("*[name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using CSS Selector - Relationships (Parent child) Denoted by >
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.cssSelector("p>input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using CSS Selector - Relationships (Sibling) Denoted by +
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.cssSelector("label+input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using CSS Selector - Partial Matches - Contains - *=
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id*='er_l']")); 
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using CSS Selector - Partial Matches - Starts with  - ^=
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id^='user_l']")); 
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using CSS Selector - Partial Matches - Ends with  - $=
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input[id$='_login']")); 
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify Submit Button using CSS Selector - Partial Matches - Contains Word - ~=
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input[value~='In']")); 
		SeleniumUtils.printElementInfo("Submit button", element);
	}
	/*
	 * Identify User Name Text field using CSS Selector - Logical Operators (OR) - comma ,
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input, *[name='pwd']")); 
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	
	/*
	 * Identify User Name text field using CSS Selector - We can give a class with the . operator
	 * which acts as an AND condition on the previous part of the CSS Selector
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input.input")); 
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify Password text field using CSS Selector - We can give an ID with the # operator
	 * which acts as an AND condition on the previous part of the CSS Selector
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.cssSelector("input#user_pass")); 
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Password text field using CSS Selector - using :not() function
	 */
	@Test
	void test07_04() {
		WebElement element = getDriver().findElement(By.cssSelector("input:not([name='log'])")); 
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	
	/*
	 * Identify User Name text field using CSS Selector - Multiple attribute (attribute names)
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type][name]")); 
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	
	/*
	 * Identify Password text field using CSS Selector - Multiple attribute (attribute names with values)
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.cssSelector("input[type='text'][name='log']")); 
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	
}
