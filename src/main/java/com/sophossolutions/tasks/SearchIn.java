package com.sophossolutions.tasks;

import static com.sophossolutions.userinterfaces.PageSearchProduct.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class SearchIn implements Task {

    public SearchIn(String product) {
        this.product = product;
    }

    private String product;

    public static SearchIn ThePageThe(String product) {
        return Tasks.instrumented(SearchIn.class,product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Type.theValue(product).into(SEARCH_THE_PRODUCT).thenHit(Keys.ENTER),
                Click.on(SELECT_THE_PRODUCCT)

        );
    }
}
