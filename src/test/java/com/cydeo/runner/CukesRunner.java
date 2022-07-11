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
        glue = "src/test/java/com/cydeo/step_definitions",
        dryRun = true,
        tags = "@wip"
)

public class CukesRunner {
}
