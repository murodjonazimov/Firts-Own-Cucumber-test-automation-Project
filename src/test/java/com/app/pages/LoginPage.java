package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(name = "email")
	public WebElement userName;

	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath="/html/body/div/form[1]/button")
	public WebElement singIn;
}
