package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends SauceDemoBasePage{

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnAddToCart = keyword.findElement(By.xpath("//*[contains(@class,'btn_inventory')]"));
	
	public void addProductToCart(){
	    keyword.click(btnAddToCart);
	}
	
	public CartPage addProductToCartAndNavigateToCart() throws Exception {
		keyword.click(btnAddToCart);
	    keyword.navigate("https://www.saucedemo.com/cart.html");
	    return new CartPage(this.driver);
	}
		
}
