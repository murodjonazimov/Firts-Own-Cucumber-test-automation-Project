package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "/html/body/div[2]/aside/div/div[5]/span")
	public WebElement verifyName;

	@FindBy(xpath = "//a[@class=\"btn btn-danger btn-sm btn-block\"]")
	public WebElement logOut;

}
