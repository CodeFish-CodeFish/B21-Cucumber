package com.smart_bear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderPage {

    public SmartBearOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Order']")
    WebElement orderLink;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement dropdown;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtUnitPrice")
    WebElement price;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtDiscount")
    WebElement discount;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtTotal")
    WebElement total;

    @FindBy(css = "input[value='Calculate']")
    WebElement calculate;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement customerName;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipCode;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_1")
    WebElement masterCardRadio;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement creditCard;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expirationDate;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processButton;

    @FindBy(xpath = "//strong[contains(.,'New order has been successfully added.')]")
    WebElement successMessage;

    public void productNameQuantity(String productName, String quantity){
        Select select = new Select(this.dropdown);
        select.selectByVisibleText(productName);
        this.quantity.sendKeys(quantity);
    }

    public void priceAndDiscount(String price, String discount){
        this.price.sendKeys(price);
        this.discount.sendKeys(discount);
    }

    public void totalCalculate(String total){
        this.total.sendKeys(total);
        this.calculate.click();
    }

    public void nameAndAddress(String name, String street){
        this.customerName.sendKeys(name);
        this.street.sendKeys(street);
    }

    public void cityStateZipCode(String city, String state, String zipCode){

        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);

    }

    public void setMasterCardRadio(){
        this.masterCardRadio.click();
    }

    public void creditAndExpiration(String credit, String expiration){

        this.creditCard.sendKeys(credit);
        this.expirationDate.sendKeys(expiration);

    }

    public void processAndValidateMessage(String successMessage){
        this.processButton.click();
        String actualMessage = this.successMessage.getText();
        Assert.assertEquals("Failed to validate success message",successMessage, actualMessage);
    }




    public void clickOnOrderLink(){
        this.orderLink.click();
    }




}
