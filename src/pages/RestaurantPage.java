package com.swiggy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.basePage.SwiggyBasePage;
import com.swiggy.util.TestUtil;

public class RestaurantPage extends SwiggyBasePage {
	public RestaurantPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='_2K_ax']//div[contains(text(),'Rice')]")
	public static WebElement foodCategory;
	
	@FindBy (xpath="//button[@class='icon-close-thin VVWx4']")
	public static WebElement closePopUp;
	

	@FindBy(xpath = "//span[@class='_1KYwd']")
	public static WebElement vegOnlyOption;

	@FindBy(xpath = "//div[@class='_1vd_H']//div[@class='_2VSxh']//div[@class='_3--N8']")
	public static WebElement onlyVegOptionMsgVerify;

	@FindBy(xpath = "//i[@class='styles_icon__m6Ujp styles_itemIcon__1LXTw icon-Veg styles_iconVeg__shLxJ']")
	public static List<WebElement> vegIcon;

	@FindBy(xpath = "//div[@class='_1cl2U']//div[@class='_1pKFz Tqef9']")
	public static WebElement cartEmptyText;

	@FindBy(xpath = "//div[@class='styles_itemName__hLfgz']//h3[@class='styles_itemNameText__3ZmZZ']")
	public static List<WebElement> itemName;

	@FindBy(xpath = "//div[@class='F8dpS zj0R0 _3L1X9']//div[@class='_1RPOp']")
	public static List<WebElement> itemAddOption;

	@FindBy(xpath = "//div[@id='menu-content']//div[@class='_2uq6N']")
	public static WebElement cartVisibleText;

	@FindBy(xpath = "//i[@class='styles_icon__m6Ujp _2MJB6 icon-Veg styles_iconVeg__shLxJ']")
	public static List<WebElement> itemVerifyVegToProceed;

	@FindBy(xpath = "//button[@class='_1gPB7']")
	public static WebElement checkOut;

	@FindBy(xpath = "//a[@class='d9y3g']")
	public static WebElement returnToHome;

	public void clkVegOnly() {
		vegOnlyOption.click();
	}

	public String vegOnlyVerifyStatusMsg() {
		String onlyVegVerifyMsg = onlyVegOptionMsgVerify.getText();
		System.out.println("<<<<<<<<<<<" + onlyVegVerifyMsg + ">>>>>>>>>>>>");
		return onlyVegVerifyMsg;
	}

	public boolean vegIconVerification() {
		for (int i = 0; i < vegIcon.size(); i++) {
			vegIcon.get(i).isEnabled();
		}
		return true;
	}
//
	public void selectCategory() {
		click(foodCategory);
	}
//
	public boolean cartEmptyVerify() {
		return cartEmptyText.isDisplayed();
	}
	

	public void itemAddToProceed() {

		for (int i = 0; i < itemName.size(); i++) {
			String actualItemName = itemName.get(i).getText();
			System.out.println(actualItemName);
			if (actualItemName.equals(prop.getProperty("expectedFoodItemName"))) {
				click(itemAddOption.get(i));
				break;
			}
			else if (actualItemName.equals(prop.getProperty("expectedFoodItemName1"))) {
				click(itemAddOption.get(i));
				break;
			}
			else {
				System.out.println("Searched Item Not Found");
				System.out.println("******************************************************************");
			}

		}
	}

	public boolean cartTextVerify() {
		return cartVisibleText.isDisplayed();
	}

	public void checkOut() {
		click(checkOut);
	}

	public void returnToHome() {
		click(returnToHome);
	}

}
