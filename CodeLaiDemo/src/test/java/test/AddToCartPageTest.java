package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;

public class AddToCartPageTest extends SauceDemoTestBase{

	@Test
	public void cannotAddToCartWithProblemUser() throws Exception {
		 LoginPage loginPage = new LoginPage(this.driver);
//	     HomePage homePage = loginPage.loginToSystem(config.getProperty("problem_user"), config.getProperty("user_password"));
//	     ProductDetailPage productDetailPage = homePage.selectFirstProduct();
//	     CartPage cartPage = productDetailPage.addProductToCartAndNavigateToCart();
	     
	     int addProductToCart = loginPage.loginToSystem(config.getProperty("problem_user"), config.getProperty("user_password"))
			    		 .selectFirstProduct()
			    		 .addProductToCartAndNavigateToCart()
			    		 .getItemsCount();
	     Assert.assertEquals(addProductToCart, 0);
	}
}
