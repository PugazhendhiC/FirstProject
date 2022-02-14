package com.swiggy.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.basePage.SwiggyBasePage;





public class LoginPage extends SwiggyBasePage {
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='_2CgXb']//span[@class='_3yZyp']/following-sibling::span[text()='Sign In']")
	public static WebElement goToSignIn;

	@FindBy(xpath = "//div[@class='_3Um38 _3lG1r']")
	public static WebElement enterPhoneNum;

	@FindBy(xpath = "//a[@class='a-ayg']")
	public static WebElement clkLogin;

	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement verifyOTP;

	public void enterLocation() {
		

	}
}
