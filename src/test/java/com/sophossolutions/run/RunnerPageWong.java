package com.sophossolutions.run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"com.sophossolutions.stepdefinitions", "com.sophossolutions.utilities"},
        features = {
                "src/test/resources/com/sophossolutions/features/restService.feature",
                "src/test/resources/com/sophossolutions/features/buyCart.feature"
        },
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class RunnerPageWong {

}
