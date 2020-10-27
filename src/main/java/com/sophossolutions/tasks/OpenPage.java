package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.MainPageWong;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophossolutions.userinterfaces.MainPageWong.CLOSE_POP_UP;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenPage implements Task {
    private MainPageWong mainPageWong;

    public static OpenPage wongResearchProduct() {
        return Tasks.instrumented(OpenPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(mainPageWong),
                WaitUntil.the(CLOSE_POP_UP, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CLOSE_POP_UP)
                        );
    }
}
