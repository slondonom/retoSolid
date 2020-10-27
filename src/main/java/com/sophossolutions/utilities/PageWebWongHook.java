package com.sophossolutions.utilities;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PageWebWongHook {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
