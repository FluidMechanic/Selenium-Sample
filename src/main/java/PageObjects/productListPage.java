package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productListPage {
	
	
	
	@FindBy(xpath="//div[contains(@class,'a-row a-spacing-micro')]")
	List<WebElement> sponsorProducts;
	
	@FindBy(xpath="//span[contains(@class,'a-price-whole')]")
	List<WebElement> priceProducts;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
