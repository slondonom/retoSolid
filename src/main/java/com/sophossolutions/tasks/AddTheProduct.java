package com.sophossolutions.tasks;

import static com.sophossolutions.userinterfaces.MainPageWong.CLOSE_POP_UP;
import static com.sophossolutions.userinterfaces.PageAddToCart.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class AddTheProduct implements Task {



    public static AddTheProduct inTheCart() {
        return Tasks.instrumented(AddTheProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_ADD_TO_CAR),
                WaitUntil.the(CLOSE_POP_UP_EMAIL, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CLOSE_POP_UP_EMAIL),
                Click.on(CLICK_SEE_CART)
        );
    }
}
