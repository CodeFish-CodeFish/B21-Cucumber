package com.qa_fox.step_definitions;

import com.qa_fox.pages.QALoginPage;
import com.qa_fox.pages.QAMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class QAStepDef {

    WebDriver driver = QAHook.driver;
    QAMainPage mainPage = new QAMainPage(driver);
    QALoginPage loginPage = new QALoginPage(driver);


    @Given("user is on main page user clicks on my account and login button")
    public void user_is_on_main_page_user_clicks_on_my_account_and_login_button() {
        mainPage.clickOnLogin();
    }
    @Then("user is landed on login page and enters email as {string} and password as {string} and clicks login button")
    public void user_is_landed_on_login_page_and_enters_email_as_and_password_as_and_clicks_login_button(String email, String password) {
        loginPage.login(email, password);
    }
    @Then("user validates error message is displayed as {string}")
    public void user_validates_error_message_is_displayed_as(String errorMsg) {

        loginPage.validateErrorMsg(errorMsg);
    }
}
