package com.sauce_labs.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/sauce_labs",
        glue = "com/sauce_labs/step_definitions",
        dryRun = false,
        tags = "@smoke"


)
public class SauceRunner {
}


