package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup {
	public WebDriver setup(String driverType) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MADELEINY\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = null;
        if(driverType == "chrome") driver = new ChromeDriver();
        else if(driverType == "firefox") driver = new FirefoxDriver();
        else if(driverType == "IE") driver = new InternetExplorerDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;
	}
}
