package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LMainPage {

    public LMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Ajax Form Submit']")
    WebElement ajaxSubmitForm;

    public void clickOnAjaxLink(){
        this.ajaxSubmitForm.click();
    }

}
