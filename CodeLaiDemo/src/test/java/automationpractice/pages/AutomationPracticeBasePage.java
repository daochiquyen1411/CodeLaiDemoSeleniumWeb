package automationpractice.pages;

import org.openqa.selenium.WebDriver;

import keyword.WebKeyword;

public class AutomationPracticeBasePage {
	public WebDriver driver;
    public WebKeyword keyword;

    public AutomationPracticeBasePage(WebDriver driver){
        this.driver = driver;
        this.keyword = new WebKeyword(driver);
    }
}
