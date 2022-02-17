package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.ProductDetailPage;
import pages.YourInformationPage;

import pages.HomePage;
import pages.LoginPage;

public class YourInfomationPageTest extends SauceDemoTestBase{
	
	@Test
	public void yourInfomationIsDisplaySuccessfully() throws Exception {
		LoginPage loginPage = new LoginPage(this.driver);
//		HomePage homePage = loginPage.loginToSystem(config.getProperty("user"), config.getProperty("user_password"));
//		ProductDetailPage productDetailPage = homePage.selectFirstProduct();
//        CartPage cartPage = productDetailPage.addProductToCartAndNavigateToCart();
//        YourInformationPage yourInformationPage = cartPage.startCheckout();
//        Assert.assertTrue(yourInformationPage.isDisplayFullInfomation());
        
        boolean isDisplayInfoSuccessfully = loginPage.loginToSystem(config.getProperty("user"), config.getProperty("user_password"))
										        		.selectFirstProduct()
										        		.addProductToCartAndNavigateToCart()
										        		.startCheckout()
										        		.isDisplayFullInfomation();
        Assert.assertTrue(isDisplayInfoSuccessfully);
	}
}
