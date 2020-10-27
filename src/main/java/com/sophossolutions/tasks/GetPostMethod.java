package com.sophossolutions.tasks;

import com.sophossolutions.utilities.Constant;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.apache.http.HttpHeaders;

public class GetPostMethod implements Task {

    private String url;

    public GetPostMethod(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Response response = SerenityRest.lastResponse();
        String dataId=response.path("data.id").toString();
        actor.attemptsTo(Get.resource(url+dataId).with(request -> request.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON).auth()
                .oauth2(Constant.ACCES_TOKEN)));
    }



    public static GetPostMethod researchMethod(String url) {
        return Tasks.instrumented(GetPostMethod.class, url);
    }

}
