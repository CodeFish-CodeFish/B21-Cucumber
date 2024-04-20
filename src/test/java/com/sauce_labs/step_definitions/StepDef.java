package com.sauce_labs.step_definitions;

import com.sauce_labs.pages.CartPage;
import com.sauce_labs.pages.LoginPage;
import com.sauce_labs.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.time.Duration;
import java.util.List;

public class StepDef {

    WebDriver driver = DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);

    CartPage cartPage = new CartPage(driver);

    // scenario section
    @When("user is on main page user validates dropdown options")
    public void user_is_on_main_page_user_validates_dropdown_options() {
        List<WebElement> options = mainPage.dropdownOptions();
        for (WebElement element : options) {

            if (element.getText().equalsIgnoreCase("Price (high to low)")) {
                element.click();
            }
        }
    }

    @Then("user clicks on hamburger menu and clicks About option then user navigates back")
    public void user_clicks_on_hamburger_menu_and_clicks_about_option_then_user_navigates_back() {
        mainPage.clickOnHamburgerAbout();
        driver.navigate().back();
    }

    @Then("user adds one product to cart and clicks on cart button")
    public void user_adds_one_product_to_cart_and_clicks_on_cart_button() {
        mainPage.addProductToCart();
    }

    @Then("user verifies that product is added and user removes the product from the cart")
    public void user_verifies_that_product_is_added_and_user_removes_the_product_from_the_cart() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.validateProductAndRemoveIt();
    }

    @When("user clicks on twitter user validates title of twitter")
    public void user_clicks_on_twitter_user_validates_title_of_twitter() throws InterruptedException {
      mainPage.clickOnTwitter(driver);

    }
    @When("user clicks on facebook user validates title of facebook")
    public void user_clicks_on_facebook_user_validates_title_of_facebook() throws InterruptedException {
       mainPage.clickOnFacebook(driver);

    }
    @When("user clicks on linkedIn user validates title of linkedIn")
    public void user_clicks_on_linked_in_user_validates_title_of_linked_in() throws InterruptedException {
        mainPage.clickOnLinkIn(driver);

    }


}
