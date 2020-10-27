package com.sophossolutions.tasks;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHeaders;

import com.google.gson.Gson;
import com.sophossolutions.utilities.Constant;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostMethod implements Task {

	private String url;
	private String body;

	public PostMethod(String url, String body) {
		this.url = url;
		this.body = body;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Post.to(url).with(request -> request.header(HttpHeaders.CONTENT_TYPE, ContentType.JSON).auth()
				.oauth2(Constant.ACCES_TOKEN).body(body)));
	}



	public static PostMethod createUser(String url, String body) {
		return Tasks.instrumented(PostMethod.class, url, body);
	}

}
