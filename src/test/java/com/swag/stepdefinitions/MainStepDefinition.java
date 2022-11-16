package com.swag.stepdefinitions;

import com.swag.utils.DriverUtils;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.swag.tasks.Login;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class MainStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Tester does the login to portal brokers with email (.*) and password (.*)$")
    public void testerDoesTheLoginToPortalBrokersWithEmailAndPassword(String email, String password) throws Exception {
        DriverUtils.setDriver(getProxiedDriver());
        theActorInTheSpotlight().attemptsTo(Login.enLaApp(email, password));
    }

    @When("^Tester choose a product$")
    public void testerChooseAProduct() {
        
    }

    @Then("^Tester save in cart this product$")
    public void testerSaveInCartThisProduct() {
        
    }

    @And("^Tester buy the product$")
    public void testerBuyTheProduct() {

    }
}
