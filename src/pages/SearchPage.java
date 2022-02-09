package com.swiggy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.basePage.SwiggyBasePage;

public class SearchPage extends SwiggyBasePage {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@type='text']")
	public static WebElement searchItem;

	
	public void searchItemInSearchBox() {
		searchItem.sendKeys(prop.getProperty("searchFood"));
	}
	
	
	

}
