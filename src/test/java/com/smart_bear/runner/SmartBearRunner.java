package com.smart_bear.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/SmartBear",
        glue = "com/smart_bear/step_definitions",
        dryRun = false

)
public class SmartBearRunner {
}
