package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//How to get the path:
//Features - content root
//Glue - Source root
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@B26G16-37"
)

public class CukesRunner {
}
