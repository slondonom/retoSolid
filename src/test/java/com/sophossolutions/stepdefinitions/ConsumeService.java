package com.sophossolutions.stepdefinitions;

import com.sophossolutions.questions.ValidateId;
import com.sophossolutions.tasks.GetPostMethod;
import com.sophossolutions.tasks.PostMethod;
import com.sophossolutions.utilities.MethodsComun;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ConsumeService {
    private DataTable dataResponse;

    @Given("(.*) create a user with the post method in (.*)")
    public void createAUserWithThePostMethod(String actor, String api) {
        theActorCalled(actor).whoCan(CallAnApi.at(api));

    }

    @When("Candidate provide information the post method with (.*)")
    public void provideInformationThePostMethod(String post, DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(PostMethod.createUser(post, MethodsComun.bodyUser(dataTable)));
        dataResponse =dataTable;
    }

    @Then("Candidate verify the creation of this user with the get method (.*)")
    public void verifyTheCreationOfThisUserWithTheGetMethod(String get ) {
        theActorInTheSpotlight().attemptsTo(GetPostMethod.researchMethod(get));
        theActorInTheSpotlight().should(seeThat(ValidateId.methodGet(dataResponse)));

    }



}
