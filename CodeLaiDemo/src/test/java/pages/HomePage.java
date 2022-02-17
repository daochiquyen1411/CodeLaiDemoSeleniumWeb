package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends SauceDemoBasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebElement inventory = keyword.findElement(By.className("inventory_list"));
	private List<WebElement> productList = inventory.findElements(By.className("inventory_item"));

	
	public ProductDetailPage selectFirstProduct(){
		keyword.click(productList.get(0).findElement(By.className("inventory_item_name")));
		return new ProductDetailPage(this.driver);
	}
	
	public String getSelectProductDescription() {
		return productList.get(0).findElement(By.className("inventory_item_desc")).getText();
	}
}
