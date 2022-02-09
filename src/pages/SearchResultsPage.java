package com.swiggy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.basePage.SwiggyBasePage;

public class SearchResultsPage extends SwiggyBasePage {

	public SearchResultsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='_3sbqM']//div[@class='_2hHME']/following-sibling::div[@class='_720-1']/span")
	public static List<WebElement> itemList;
	// div[@class='_3sbqM']//div[@class='_2hHME']/following-sibling::div[@class='_720-1']//child::span[@class='NJWoG']

	@FindBy(xpath = "//div[@class='_3sbqM']//div[@class='_34T1N Mpmtv']")
	public static WebElement itemToSelect;

	@FindBy(xpath = "//div[@class='_3Ztcd']//child::div[@class='nA6kb']")
	public static List<WebElement> restaurantName;

	public static boolean listOfItemsShown() {

		boolean status = false;

		for (int i = 0; i < itemList.size(); i++) {
			String actualItemName = itemList.get(i).getText();
			if (actualItemName.contains(prop.getProperty("expectedItemName"))) {
				System.out.println(actualItemName);
				status = true;
			} else {
				System.out.println("Item not contains " + prop.getProperty("expectedItemName"));
				status = false;
				break;
			}
		}
		return status;

	}

	public void selectItemToProceed() {
		for (int i = 0; i < itemList.size(); i++) {
			String actualItemName = itemList.get(i).getText();
			if (actualItemName.equals(prop.getProperty("itemToSelect"))) {
				click(itemList.get(i));
			} else {
				System.out.println("<<<<<<<<<<<----------Searched Item Not Found------------>>>>>>>>>>>");
				System.out.println("******************************************************************");
			}
		}
	}

	public void selectRestaurantToProceed() {
		for (int i = 0; i < restaurantName.size(); i++) {
			String actualRestaurantName = restaurantName.get(i).getText();
			System.out.println(actualRestaurantName);
			if (actualRestaurantName.equals(prop.getProperty("expectedRestaurantName"))) {
				click(restaurantName.get(i));
				break;
			} else {
				System.out.println("Result not contains " + prop.getProperty("expectedRestaurantName"));
				System.out.println("******************************************************************");
			}
		}
	}

}
