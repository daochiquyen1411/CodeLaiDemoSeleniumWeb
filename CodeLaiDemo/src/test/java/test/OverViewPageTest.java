package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CompletePage;
import pages.HomePage;
import pages.LoginPage;
import pages.OverViewPage;
import pages.ProductDetailPage;
import pages.YourInformationPage;
import testdata.AccountTestData;

public class OverViewPageTest extends SauceDemoTestBase{
	
	@Test(dataProvider = "AccountTestData", dataProviderClass = AccountTestData.class)
	public void OverViewPageDisplaySuccessfully(String username, String password) throws Exception{
		LoginPage loginPage = new LoginPage(this.driver);
		HomePage homePage = loginPage.loginToSystem(username, password);
		String SelectProductDescription = homePage.getSelectProductDescription();
		System.out.println(SelectProductDescription);
		ProductDetailPage productDetailPage = homePage.selectFirstProduct();
		CartPage cartpage = productDetailPage.addProductToCartAndNavigateToCart();
		YourInformationPage yourInformationPage = cartpage.startCheckout();
		OverViewPage overViewPage = yourInformationPage.inputInformationAndContinue();
		Assert.assertTrue(overViewPage.isPaymentAndShippingInfoDisplay());
		Assert.assertEquals(SelectProductDescription, overViewPage.getProductDescription());
		Assert.assertTrue(overViewPage.itemTotalAndTaxShouldNotBeString());
		
	}	
}
