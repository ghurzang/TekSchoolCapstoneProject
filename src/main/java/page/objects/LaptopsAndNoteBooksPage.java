package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsAndNoteBooksPage extends Base {
	
	
	public LaptopsAndNoteBooksPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	public boolean isLogoDisplay() {
		if(logo.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickLaptopsAndNotebooks;
	
	public void clickLaptopsAndNotebooks() {
		clickLaptopsAndNotebooks.click();
	}
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement clickShowAllLaptopsAndNotebooks;
	
	public void clickShowAllLaptopsAndNotebooks() {
		clickShowAllLaptopsAndNotebooks.click();
	}
	
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement clickMacbookItem;
	
	public void clickMacbookItem() {
		clickMacbookItem.click();
	}
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement clickAddToCartBtn;
	
	public void  clickAddToCartBtn() {
		 clickAddToCartBtn.click();
	}
	
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement seeSuccessMessage;
	
	public boolean seeSuccessMessage() {
		if(seeSuccessMessage.isDisplayed())
			return true;
		else
			return false; 
	}
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement showCartTotalInBtn;
	
	public boolean showCartTotalInBtn() {
		if(showCartTotalInBtn.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath = "//div[@id='cart']")
	private WebElement clickshowCartTotalInBtn;
	
	public void clickshowCartTotalInBtn() {
		clickshowCartTotalInBtn.click();
	}
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemoveBtn;
	
	public void clickOnRemoveBtn() {
		clickOnRemoveBtn.click();
	}
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement showCartTotalZero;
	
	public boolean showCartTotalZero() {
		if(showCartTotalZero.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	

}