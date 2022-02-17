package testdata;

import org.testng.annotations.DataProvider;

import helper.JsonHelper;

public class AccountTestData {
	 @DataProvider(name = "AccountTestData")
	 public static Object[][] dataTest(){
	     return JsonHelper.ReadJsonFromFile("src/test/resources/saucedemo/testdata/account.json");
	 }
}
