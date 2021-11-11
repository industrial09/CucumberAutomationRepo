package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMethods extends Setup{
	WebDriver driver = null;
	WebDriverWait wait = new WebDriverWait(driver, 15);
	Actions action = new Actions(driver);
	LandingPageLocators locators = new LandingPageLocators();
	
	public void setUp() {
		driver = setup("chrome");
	}
	
	public void searchForAnItem(String item) throws InterruptedException {
		WebElement searchField = driver.findElement(By.className(locators.searchFieldName));
		searchField.sendKeys(item);
		WebElement searchIcon = driver.findElement(By.className(locators.searchIcondName));
		wait.until(ExpectedConditions.visibilityOf(searchIcon));
		action.doubleClick(searchIcon);
	}
	
	public void clickOnSearchIcon() throws InterruptedException {
		WebElement searchIcon = driver.findElement(By.className(locators.searchIcondName));
		wait.until(ExpectedConditions.visibilityOf(searchIcon));
		searchIcon.click();
		Thread.sleep(3000);
	}
	
	public List<WebElement> iVerifySearchedItemsAreDisplayed() {
		List<WebElement> items = driver.findElements(By.className(locators.searchIcondName));
		return items;
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
