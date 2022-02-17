package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.YourInformationPage;

public class CartPage extends SauceDemoBasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement btnCheckout = keyword.findElement(By.id("checkout"));
	private WebElement cartList = keyword.findElement((By.className("cart_list")));
    private List<WebElement> itemList = cartList.findElements(By.className("cart_item"));
    
	public YourInformationPage startCheckout(){
        keyword.click(this.btnCheckout);
        return new YourInformationPage(this.driver);
    }
	
	public int getItemsCount(){
        return itemList.size();
    }
}
