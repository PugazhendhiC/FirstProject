package com.swiggy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.basePage.SwiggyBasePage;




public class CheckOutPage extends SwiggyBasePage {
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath="//a[@title='Swiggy']")
	public static WebElement returnToHome;

}
