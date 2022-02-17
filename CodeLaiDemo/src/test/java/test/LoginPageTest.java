package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends SauceDemoTestBase{
	@Test
	public void loginUnsuccessfullytest() throws IOException {
		LoginPage loginPage = new LoginPage(this.driver);		
		String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
		
		String actualErrorMessage = loginPage.login(config.getProperty("login_unsucessfully_user"), config.getProperty("user_password"))
											.getErrorMessageText();
		
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
				
	}
}
