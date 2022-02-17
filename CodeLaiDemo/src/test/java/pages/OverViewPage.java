package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.CompletePage;

public class OverViewPage extends SauceDemoBasePage{

	public OverViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement btnFinish = keyword.findElement(By.id("finish"));
	private WebElement blockSummaryInfo = keyword.findElement(By.className("summary_info"));
	private List<WebElement> valueLabelList = blockSummaryInfo.findElements(By.className("summary_value_label"));
	private WebElement productDescription = keyword.findElement(By.className("inventory_item_desc"));
	private WebElement lblItemTotal = keyword.findElement(By.className("summary_subtotal_label"));
	private WebElement lblTax = keyword.findElement(By.className("summary_tax_label"));
	private WebElement lblTotal = keyword.findElement(By.className("summary_total_label"));
	
    public CompletePage finishCheckout(){
        keyword.click(this.btnFinish);
        return new CompletePage(this.driver);
    }
    
    public boolean isPaymentAndShippingInfoDisplay() throws Exception {
		for (WebElement e : valueLabelList) {
			if(e.getText() == null) {				
				return false;
			}
			System.out.println(e.getText());
		}		
		return true;
	}
    
    public String getProductDescription() {
    	return productDescription.getText();
    }
    
    public boolean itemTotalAndTaxShouldNotBeString() {
//    	String itemTotalText = lblItemTotal.getText();
    	Float itemValue = null,taxValue = null,totalValue = null;
    	
    	try {
    		itemValue = Float.parseFloat(lblItemTotal.getText().replaceFirst(".*?([\\d.]+).*", "$1"));
        	taxValue = Float.parseFloat(lblTax.getText().replaceFirst(".*?([\\d.]+).*", "$1"));
        	totalValue = Float.parseFloat(lblTotal.getText().replaceFirst(".*?([\\d.]+).*", "$1"));
    	}catch (Exception e){
    		System.out.println("Item total and tax is String");
    	}

    	
    	if (itemValue != null && taxValue != null && totalValue != null) {
    		return true;
    	}
    	return false;
    	
    }
}

