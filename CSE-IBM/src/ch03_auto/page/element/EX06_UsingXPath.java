package ch03_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class EX06_UsingXPath extends BaseTest1{

	/*
	 * Identify user name text field with Absolute XPath
	 * NEVER NEVER NEVER use Absolute XPath in your professional work
	 * Absolute Xpath are Evil ;->
	 */	
	@Test
	void test00() {
		WebElement element = getDriver().findElement(By.xpath("/html/body/div[1]/form/p[1]/input"));
		SeleniumUtils.printElementInfo("User Name Text field", element);
	}
	
	/*
	 * Identify user name text field - XPath (Tag name)
	 * Now onwards, we stick to Relative XPaths as Absolute XPath are brittle
	 */	
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.xpath("//input"));
		SeleniumUtils.printElementInfo("User Name Text field", element);
	}
	/*
	 * Identify user name text field - XPath (Tag name with attribute)
	 */	
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type]"));
		SeleniumUtils.printElementInfo("User Name Text field", element);
	}
	/*
	 * Identify Password text field - XPath (Tag, attribute and value)
	 */	
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password']"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}

	/*
	 * Identify Password text field - XPath (Tag, attribute and value)
	 * variant of test03 - ID
	 */	
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@id='user_login']"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}
	
	/*
	 * Identify Password text field - XPath (Tag, attribute and value)
	 * variant of test03 - class 
	 */	
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input']"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}
	
	/*
	 * Identify Password text field - XPath (Tag, attribute and value)
	 * variant of test03 - name 
	 */	
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='log']"));
		SeleniumUtils.printElementInfo("Password Text field", element);
	}
	
	/*
	 * Identify User name  text field - XPath any tag - attribute with value
	 * variant of test03 
	 */	
	@Test
	void test03_05() {
		WebElement element = getDriver().findElement(By.xpath("//*[@name='log']"));
		SeleniumUtils.printElementInfo("User Name Text field", element);
	}
	
	/*
	 * Identify Lost your password - XPath - text
	 */	
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.xpath("//*[text()='Lost your password?']"));
		SeleniumUtils.printElementInfo("Lost your password", element);
	}
	/*
	 * Identify User Name text field using XPath - Relationships (Parent to child)
	 */	
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.xpath("//p/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field using XPath - Relationships - Following Sibling
	 */	
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.xpath("//label/following-sibling::input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User Name text field using XPath - Partial Match - attribute value contains
	 */	
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[contains(@id,'er_l')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field using XPath - Partial Match - attribute value starts-with
	 */	
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[starts-with(@id,'user_l')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User Name text field using XPath - Partial Match - attribute value ends-with
	 * ends-with is not supported in current browsers. As it requires XPath 2.0 
	 * whereas all browsers use XPath 1
	 */	
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[ends-with(@id,'_login')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Lost your password using XPath - Partial Match - Text Contains
	 */	
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.xpath("//a[contains(text(),'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password", element);
	}
	/*
	 * Identify Lost your password using XPath - Partial Match - Text starts with
	 */	
	@Test
	void test06_05() {
		WebElement element = getDriver().findElement(By.xpath("//a[starts-with(text(),'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password", element);
	}
	
	/*
	 * Identify User name text field using XPath - Logical OR - using or keyword
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' or @id='user_login']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Password text field using XPath - Logical AND - using and keyword
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' and @id='user_login']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Password text field using XPath - Logical NOT - using not() function
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' and not(@name='pwd')]"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify Login Form using XPath - Hierarchy (Axes) - Parent
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/../.."));
		SeleniumUtils.printElementInfo("Login Form", element);
	}

	/*
	 * Identify User name text field using XPath - Hierarchy (Axes) - Descendant
	 * using // instead of / between form and input
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.xpath("//form//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Hierarchy (Axes) - Ancestors
	 */
	@Test
	void test08_03() {
		WebElement element = getDriver().findElement(By.xpath("//input/ancestor::form"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Hierarchy (Axes) -
	 * preceding-sibling Started with the submit paragraph
	 */
	@Test
	void test08_04() {
		WebElement element = getDriver().findElement(By.xpath("//p[@class='submit']/preceding-sibling::p//input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Index - (Index uses Human
	 * counting) This variant looks at children of the same parent That is the
	 * reason, //input[2] does not point to the password field
	 */
	@Test
	void test09_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[2]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Index - (Index uses Human
	 * counting) This variant looks at elements across the DOM That is the reason,
	 * (//input)[2] does point to the password field
	 */
	@Test
	void test09_02() {
		WebElement element = getDriver().findElement(By.xpath("(//input)[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Multiple attribute
	 */
	@Test
	void test10_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type and @name]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}

	/*
	 * Identify User name text field using XPath - Multiple attribute with values
	 */
	@Test
	void test10_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='text' and @name='log']"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	
}