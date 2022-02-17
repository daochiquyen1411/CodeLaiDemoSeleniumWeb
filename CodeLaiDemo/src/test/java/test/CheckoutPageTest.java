package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.YourInformationPage;

import testdata.AccountTestData;
import pages.CartPage;
import pages.CompletePage;
import pages.HomePage;
import pages.LoginPage;
import pages.OverViewPage;
import pages.ProductDetailPage;


public class CheckoutPageTest extends SauceDemoTestBase{
	
	@Test(dataProvider = "AccountTestData", dataProviderClass = AccountTestData.class)
	public void CheckoutSuccessfullytest(String username, String password) throws Exception{
		LoginPage loginPage = new LoginPage(this.driver);
		String expectedResult = "THANK YOU FOR YOUR ORDER";
//		HomePage homePage = loginPage.loginToSystem(username, password);
//		ProductDetailPage productDetailPage = homePage.selectFirstProduct();
//		productDetailPage.addProductToCart();
//		CartPage cartpage = productDetailPage.navigateToCart();
//		YourInformationPage yourInformationPage = cartpage.startCheckout();
//		OverViewPage overViewPage = yourInformationPage.inputInformationAndContinue();
//		CompletePage completePage = overViewPage.finishCheckout();
//		Assert.assertTrue(completePage.isSuccessHeaderDisplay());
		
		String actualResult = loginPage.loginToSystem(username, password)
										.selectFirstProduct()
										.addProductToCartAndNavigateToCart()
										.startCheckout()
										.inputInformationAndContinue()
										.finishCheckout()
										.getCompleteMessage();
		
		Assert.assertEquals(expectedResult, actualResult);;		
	}	
}
