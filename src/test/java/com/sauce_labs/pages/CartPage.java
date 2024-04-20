package com.sauce_labs.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
    WebElement productName;

    @FindBy(css = "#remove-sauce-labs-backpack")
    WebElement removeButton;

    public void validateProductAndRemoveIt(){

        Assert.assertTrue(this.productName.isDisplayed());
        this.removeButton.click();

    }




}
