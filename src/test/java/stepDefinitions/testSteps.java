package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestMethods;

public class testSteps extends TestMethods{
	@Before
	public void setUp() {
		setUp();
	}
	
	@Given("I am on Login page I search for a dress")
	public void i_am_on_login_page() throws InterruptedException {
		searchForAnItem("dress");
		//clickOnSearchIcon();
	}

	@And("I verify I can see items displayed")
	public void some_other_precondition() {
		List<WebElement> itemList = iVerifySearchedItemsAreDisplayed();
		Assert.assertTrue(itemList.size() > 0, "At least 1 searched item was expected to be displayed");
	}
	
	@After
	public void tearDown() {
		tearDown();
	}
}
