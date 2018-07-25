package com.app.definitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.app.pages.HomePage;
import com.app.pages.LoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageDefinitions {
	WebDriver driver = Driver.getDriver();
	HomePage homePage = new HomePage();

	@Given("log in to the page")
	public void log_in_to_the_page() {
		System.out.println("log in to the page");
		LoginPage loginPage = new LoginPage();

		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.singIn.click();

	}

	@When("verify what you on page")
	public void verify_what_you_on_page() {
		System.out.println("verify what you on page");
		String actual = homePage.verifyName.getText();
		String expected = "Super Admin Admin";
		Assert.assertTrue(actual.contains(expected));
	}

	@Then("log out from page")
	public void log_out_from_page() {
		System.out.println("log out from page");
		homePage.logOut.click();

	}

}
