package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;

import java.time.Duration;
import java.util.List;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement header;

    @FindBy(css = "select[class='product_sort_container']")
    WebElement dropdown;

    @FindBy(css = "#react-burger-menu-btn")
    WebElement hamburgerMenu;

    @FindBy(xpath = "//a[.='About']")
    WebElement aboutButton;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement backpack;

    @FindBy(css = "#shopping_cart_container")
    WebElement cart;

    @FindBy(xpath = "//a[.='Twitter']")
    WebElement twitter;

    @FindBy(xpath = "//a[.='Facebook']")
    WebElement facebook;

    @FindBy(xpath = "//a[.='LinkedIn']")
    WebElement linkedIn;


    public String getHeader() {
        return BrowserUtils.getText(this.header);
    }

    public List<WebElement> dropdownOptions() {
        Select select = new Select(dropdown);
        return select.getOptions();
    }

    public void clickOnHamburgerAbout() {
        this.hamburgerMenu.click();
        this.aboutButton.click();
    }

    public void addProductToCart() {

        this.backpack.click();
        this.cart.click();

    }

    public void clickOnTwitter(WebDriver driver) throws InterruptedException {

        this.twitter.click();
        BrowserUtils.switchWindowsById(driver);
        Thread.sleep(2000);
        String twitterTitle = "Sauce Labs (@saucelabs) / X";
        BrowserUtils.switchWindowByTitle(driver, twitterTitle);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        BrowserUtils.switchWindowsById(driver);

    }

    public void clickOnFacebook(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        this.facebook.click();
        String facebookTitle = "Sauce Labs | San Francisco CA | Facebook";
        BrowserUtils.switchWindowByTitle(driver, facebookTitle);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        BrowserUtils.switchWindowByTitle(driver, "Swag Labs");

    }

    public void clickOnLinkIn(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        this.linkedIn.click();
        String linkedInTitle = "Sign Up | LinkedIn";
        BrowserUtils.switchWindowByTitle(driver, linkedInTitle);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        BrowserUtils.switchWindowByTitle(driver, "Swag Labs");


    }


}
