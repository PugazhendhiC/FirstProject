package com.swiggy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.basePage.SwiggyBasePage;

public class HomePage extends SwiggyBasePage{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	public static WebElement enterLocation;
	
	@FindBy (xpath = "//div[@class='_1oLDb']//span[@class='_2W-T9']")
	public static WebElement location;

	@FindBy (xpath="//a[@class='_1T-E4']//span[@class='_3yZyp']/following-sibling::span[text()='Search']")
	public static WebElement searchBtn;
	
	@FindBy (xpath="//a[@class='_1T-E4']//span[@class='_3yZyp _18ZFk']//span[@class='_2vS77']")
	public static WebElement countInCart;
	
	
	public void navToSearchPage() {
		enterLocation.sendKeys(prop.getProperty("Location"));
		location.click();
		searchBtn.click();
	}
	
	public boolean cartItemCountCheck() {
		String countOfAddedItems = countInCart.getText();
		System.out.println(countOfAddedItems);
		return true;
	}
	
}


