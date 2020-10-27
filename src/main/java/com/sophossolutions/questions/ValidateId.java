package com.sophossolutions.questions;

import cucumber.api.DataTable;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ValidateId implements Question<Boolean> {

    public ValidateId(DataTable validateId) {
        ValidateId = validateId;
    }
    private DataTable ValidateId;

    public static Question<Boolean> methodGet(DataTable dataResponse) {

        return new ValidateId(dataResponse);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        List<List<String>> raw = ValidateId.raw();
        Response response = SerenityRest.lastResponse();
        String name=raw.get(0).get(0) + " " +  raw.get(0).get(1);
        String gender=raw.get(0).get(2);
        String email=raw.get(0).get(4);
        String status=raw.get(0).get(5);
        if (!name.equals(response.path("data.name")))return false;
        if (!gender.equals(response.path("data.gender")))return false;
        if (!email.equals(response.path("data.email")))return false;
        return status.equals(response.path("data.status")) ;
    }
}
