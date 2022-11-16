package com.swag.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/LoginBuy.feature",
        glue = "com.swag",
        snippets = SnippetType.CAMELCASE
)
public class LoginBuyRunner {
}
