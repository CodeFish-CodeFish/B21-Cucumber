package com.qa_fox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAMainPage {

    public QAMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[.='Login']")
    WebElement login;

    public void clickOnLogin(){
        this.myAccount.click();
        this.login.click();
    }



}
