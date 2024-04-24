package com.lambda.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/lambda/ajaxSubmitForm",
        glue = "com/lambda/step_definitions",
        dryRun = false,// if this is set to true, it will not run, instead if there's no steps defined, then it will generate snippets
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}

)
public class LRunner {
}
