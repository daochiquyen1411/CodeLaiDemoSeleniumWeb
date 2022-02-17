package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.OverViewPage;

public class YourInformationPage extends SauceDemoBasePage{

	public YourInformationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement txtFirstName = keyword.findElement(By.id("first-name"));
	private WebElement txtLastName = keyword.findElement(By.id("last-name"));
	private WebElement txtZipcode = keyword.findElement(By.id("postal-code"));
	private WebElement btnContinue = keyword.findElement(By.id("continue"));

	public void continueOrder(){
	   keyword.click(btnContinue);
	}
	
	public void inputCheckoutInformation(){
	   keyword.setText(txtFirstName, "First Name");
	   keyword.setText(txtLastName, "Last Name");
	   keyword.setText(txtZipcode, "70000");
	}
	
	public OverViewPage inputInformationAndContinue(){
        inputCheckoutInformation();
        continueOrder();
        return new OverViewPage(this.driver);
    }
	
	public boolean isDisplayFullInfomation() {
		 if(txtFirstName.isDisplayed() && txtLastName.isDisplayed() && txtZipcode.isDisplayed() && btnContinue.isDisplayed()){
	            return true;
	     }
	     else return false;
	}
}
