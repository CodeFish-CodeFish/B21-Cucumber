package com.qa_fox.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QALoginPage {

    public QALoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#input-email")
    WebElement email;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(css = "input[class='btn btn-primary']")
    WebElement loginBtn;

    @FindBy(xpath = " //div[.='Warning: No match for E-Mail Address and/or Password.']")
    WebElement errorMsg;

    public void login(String email, String password){

        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginBtn.click();

    }

    public void validateErrorMsg(String errorMsg){
        Assert.assertEquals(errorMsg, this.errorMsg.getText());
    }




}
