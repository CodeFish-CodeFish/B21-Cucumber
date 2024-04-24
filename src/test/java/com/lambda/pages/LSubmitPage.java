package com.lambda.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LSubmitPage {

    public LSubmitPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#title")
    WebElement name;

    @FindBy(css = "#description")
    WebElement message;

    @FindBy(css = "#btn-submit")
    WebElement submitBtn;

    @FindBy(css = "#submit-control")
    WebElement successMessage;

    public void nameAndMessageFields(String name, String message){

        this.name.sendKeys(name);
        this.message.sendKeys(message);

    }

    public void submitAndSuccessMsg(String successMessage){

        this.submitBtn.click();
        Assert.assertEquals(successMessage, this.successMessage.getText());

    }



}
