package com.Bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html", "json:target/cucumber.json","rerun:target/rerun.txt"},
        features = "src/test/resources/features", // featuresin pathi
        glue = "com/Bitrix/step_definitions", // step definitions in pathi ikisini birbirine bagliyor
        dryRun = false,
        tags =" @login"

)
public class CukesRunner {
}
