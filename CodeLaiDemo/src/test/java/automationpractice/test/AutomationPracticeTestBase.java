package automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import configuration.Configuration;
import driver.DriverFactory;
import keyword.WebKeyword;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeTestBase {
	 public WebDriver driver;
	    public WebKeyword keyword;
	    public Configuration config;

	    @BeforeMethod
	    public void setUp() throws Exception {
	        WebDriverManager.chromedriver().setup();
	        this.config = new Configuration("src/test/resources/automationpractice/config.properties");
	        this.driver = DriverFactory.getDriver(config.getProperty("browser"));
	        this.keyword = new WebKeyword(driver);
	        keyword.openUrl(config.getProperty("url"));
	    }

	    @AfterMethod
	    public void tearDown(){
	        this.driver.quit();
	    }
}
