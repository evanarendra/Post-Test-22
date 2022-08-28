package com.juaracoding.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class TestCRUD {

	@Test
	public void testPost() {
		JSONObject request = new JSONObject();
		request.put("name","John");
		request.put("job","QA Engineer");
		System.out.print(request.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
	}
	@Test
	public void testPut() {
		
	}
	@Test
	public void testPatch() {
		
	}
	@Test
	public void testDelete() {
		
	}
}
