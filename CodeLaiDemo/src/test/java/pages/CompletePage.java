package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage extends SauceDemoBasePage{

	public CompletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement successHeader = keyword.findElement(By.className("complete-header"));

	public boolean isSuccessHeaderDisplay(){
	    return successHeader.isDisplayed();
	}
	
	public String getCompleteMessage() {
		return successHeader.getText();
	}
}
