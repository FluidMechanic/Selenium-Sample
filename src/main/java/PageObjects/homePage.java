package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import amazonTest.Homepage.baseClass;

public class homePage extends baseClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[contains(@id,'twotabsearchtextbox')]")
	WebElement searchBar;
	
	@FindBy(xpath="//input[contains(@id,'nav-search-submit-button')]")
	WebElement searchButton;
	
	@FindBy(xpath="//a[contains(@class,'a-button-text')]")
	WebElement signInButton;
	
	@FindBy(xpath="//input[contains(@type,'email') and @id='ap_email']")
	WebElement emailInput;
	
	@FindBy(xpath="//input[contains(@class,'a-button-input') and @id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//a[contains(@id,'nav-logo-sprites')]")
	WebElement amazonLogo;
	
	homePage(WebDriver driver)
	{
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void search(String productName)
	{
		searchBar.sendKeys(productName);
		searchButton.click();
		
	}
	
	public void signIn(String email)
	{
		signInButton.click();
		emailInput.sendKeys(email);
		continueButton.click();
		
	}
	
	public void logoValidate()
	{
		boolean visible=amazonLogo.isDisplayed();
		Assert.assertEquals(true, visible);
		
	}
	
}
