package com.sauce_labs.step_definitions;

import com.sauce_labs.pages.LoginPage;
import com.sauce_labs.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class SLAuthentication {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    MainPage mainPage = new MainPage(driver);

    @Given("user is on navigated to login page")
    public void user_is_on_navigated_to_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user is on login page user provides username and password")
    public void user_is_on_login_page_user_provides_username_and_password() {
        loginPage.setLogin("standard_user", "secret_sauce");
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("user validates title and url of the main page")
    public void user_validates_title_and_url_of_the_main_page() {
        //validating title of main page
        String expectedTitle = "Swag Labs";
        String actualTitle = BrowserUtils.getTitleWithJS(driver);
        Assert.assertEquals("Failed to validate title of main page", expectedTitle, actualTitle);

        //validating url
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("Failed to validate URL of main page", expectedURL, actualURL);


    }

    @Then("user validates main page header")
    public void user_validates_main_page_header() {

        String expectedHeader = "Swag Labs";
        String actualHeader = mainPage.getHeader();
        Assert.assertEquals(expectedHeader, actualHeader); // validation with assignment

        Assert.assertEquals("Swag Labs", mainPage.getHeader()); // validation without assignment


    }

}
