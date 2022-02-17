package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import pages.HomePage;

public class LoginPage extends SauceDemoBasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement txtUserName = keyword.findElement(By.id("user-name"));
	private WebElement txtPassWord = keyword.findElement(By.id("password"));	
	private WebElement btnLogin = keyword.findElement(By.id("login-button"));
	
	public HomePage loginToSystem(String username, String password) {
		 keyword.setText(txtUserName, username);
	     keyword.setText(txtPassWord, password);
	     keyword.click(btnLogin);	  
	     return new HomePage(this.driver);
	}
	
	public LoginPage login(String username, String password) {
		 keyword.setText(txtUserName, username);
	     keyword.setText(txtPassWord, password);
	     keyword.click(btnLogin);	   
	     return this;
	}
	
	public String getErrorMessageText(){
	     return keyword.findElement(By.xpath("//*[@data-test = 'error']")).getText();
	}
}
