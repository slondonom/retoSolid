package com.sophossolutions.questions;


import static com.sophossolutions.userinterfaces.PageVerifyProduct.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verify implements Question<Boolean> {

    private String thisProduct;

    public Verify(String thisProduct) {
        this.thisProduct = thisProduct;
    }

    public static Verify inTheCart(String thisProduct) {
        return new Verify(thisProduct);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameProduct = Text.of(VERIFY_PRODUCT).viewedBy(actor).asString();
        return (nameProduct.equals(thisProduct));
    }
}
