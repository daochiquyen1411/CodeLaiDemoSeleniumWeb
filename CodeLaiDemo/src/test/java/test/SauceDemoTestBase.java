package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;

import configuration.Configuration;
import keyword.WebKeyword;

public class SauceDemoTestBase {
	  public WebDriver driver;
	  public WebKeyword keyword;
	  public Configuration config;
	  
	  @BeforeMethod
	  public void setUp() throws Exception {
		  this.config = new Configuration("src/test/resources/saucedemo/config.properties");
	      this.driver = DriverFactory.getDriver(config.getProperty("browser"));
	      this.keyword = new WebKeyword(driver);
	      keyword.openUrl(config.getProperty("url"));
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  this.driver.quit();
	  }
}
