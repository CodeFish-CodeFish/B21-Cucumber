package com.smart_bear.step_definitions;

import com.smart_bear.pages.SmartBearLoginPage;
import com.smart_bear.pages.SmartBearOrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class StepDefinitions {

    WebDriver driver = Hook.driver;

    SmartBearLoginPage loginPage = new SmartBearLoginPage(driver);

    SmartBearOrderPage orderPage = new SmartBearOrderPage(driver);


    @Given("user is navigated to main page of smartBear")
    public void user_is_navigated_to_main_page_of_smart_bear() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @When("user is on login page user enters username as {string} and password as {string}")
    public void user_is_on_login_page_user_enters_username_as_and_password_as(String username, String password) {
        loginPage.login(username, password);
    }
    @Then("user clicks on login btn")
    public void user_clicks_on_login_btn() {
        loginPage.clickOnLoginButton();
    }
    @Then("user clicks on order button from main page")
    public void user_clicks_on_order_button_from_main_page() {
        orderPage.clickOnOrderLink();
    }
    @Then("user selects {string} from the dropdown and enters {string} into quantity field")
    public void user_selects_from_the_dropdown_and_enters_into_quantity_field(String productName, String quantity) {
        orderPage.productNameQuantity(productName, quantity);
    }
    @When("user enters price as {string} and discount as {string}")
    public void user_enters_price_as_and_discount_as(String price, String discount) {
        orderPage.priceAndDiscount(price, discount);
    }
    @Then("user enters total as {string} and clicks calculate button")
    public void user_enters_total_as_and_clicks_calculate_button(String total) {
        orderPage.totalCalculate(total);
    }
    @Then("user provides customer name as {string} and address as {string}")
    public void user_provides_customer_name_as_and_address_as(String name, String address) {
        orderPage.nameAndAddress(name, address);
    }
    @Then("user enters city as {string} and state as {string} and zipCode as {string}")
    public void user_enters_city_as_and_state_as_and_zip_code_as(String city, String state, String zipCode) {
        orderPage.cityStateZipCode(city, state, zipCode);
    }
    @Then("user checks mastercard radio button")
    public void user_checks_mastercard_radio_button() {
        orderPage.setMasterCardRadio();
    }
    @Then("user enters credit number as {string} and expiration as {string}")
    public void user_enters_credit_number_as_and_expiration_as(String creditCard, String expiration) {
        orderPage.creditAndExpiration(creditCard, expiration);
    }
    @Then("user clicks on process button and validates success message as {string}")
    public void user_clicks_on_process_button_and_validates_success_message_as(String successMessage) {
        orderPage.processAndValidateMessage(successMessage);
    }


}
