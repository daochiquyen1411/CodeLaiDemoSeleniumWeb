package pages;

import org.openqa.selenium.WebDriver;

import pages.CartPage;

import keyword.WebKeyword;


public class SauceDemoBasePage {
    public WebDriver driver;
    public WebKeyword keyword;

    public SauceDemoBasePage(WebDriver driver){
        this.driver = driver;
        this.keyword = new WebKeyword(driver);
    }

  
}