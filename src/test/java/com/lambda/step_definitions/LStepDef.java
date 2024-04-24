package com.lambda.step_definitions;

import com.lambda.pages.LMainPage;
import com.lambda.pages.LSubmitPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class LStepDef {

    WebDriver driver = LHook.driver;

    LMainPage mainPage = new LMainPage(driver);

    LSubmitPage submitPage = new LSubmitPage(driver);

    @Given("user is on main page of lambda web app user clicks on ajax submit form link")
    public void user_is_on_main_page_of_lambda_web_app_user_clicks_on_ajax_submit_form_link() {
        mainPage.clickOnAjaxLink();
    }

    @Then("user enters name and message as follows")
    public void user_enters_name_and_message_as_follows(io.cucumber.datatable.DataTable dataTable) {

        Map<String, String> info = dataTable.asMap();
        String name = info.get("name");
        String message = info.get("message");
        submitPage.nameAndMessageFields(name, message);


    }

    @Then("user clicks on submit button and verifies that success message is")
    public void user_clicks_on_submit_button_and_verifies_that_success_message_is(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        submitPage.submitAndSuccessMsg(map.get("successMessage"));
    }




}
