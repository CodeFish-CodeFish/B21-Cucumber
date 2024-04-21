package com.smart_bear.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class Hook {

   public static WebDriver driver;

    @Before
    public void initializeDriver() {

        driver = DriverHelper.getDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {

        //BrowserUtils.takeScreenshot(scenario, driver);
        Thread.sleep(3000);
        driver.quit();
    }


}
