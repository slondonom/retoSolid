package com.sophossolutions.stepdefinitions;

import com.sophossolutions.tasks.AddTheProduct;
import com.sophossolutions.tasks.OpenPage;
import com.sophossolutions.tasks.SearchIn;
import com.sophossolutions.questions.Verify;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ResearchProductStepDefinition {


    @Given("^The (.*) open page wong$")
    public void theUserOpenPageWongPe(String sebastian) {
        theActorCalled(sebastian).wasAbleTo(OpenPage.wongResearchProduct());
    }

    @When("^search the (.*)$")
    public void searchThePanCentenoVollkornMestemacherG(String product) {
        theActorInTheSpotlight().attemptsTo(SearchIn.ThePageThe(product));

    }

    @When("^the product is add to the cart$")
    public void theProductIsAddToTheCart() {
        theActorInTheSpotlight().attemptsTo(AddTheProduct.inTheCart());

    }

    @Then("^Check if the (.*) was added to the cart with the name$")
    public void checkIfThePanCentenoVollkornMestemacherGWasAddedToTheCartWithTheName(String thisProduct) {
        theActorInTheSpotlight().should(seeThat(Verify.inTheCart(thisProduct)));

    }
}
