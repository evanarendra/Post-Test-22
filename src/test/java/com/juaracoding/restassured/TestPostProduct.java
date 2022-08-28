package com.juaracoding.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
public class TestPostProduct {

String endpoint = "https://mern-backend-8881.herokuapp.com/products";
	
	@Test
	public void testPost() {
//https://reqres.in/api/users / Web data API nya
		
		JSONObject request = new JSONObject();
		request.put("name", "Evan");
		request.put("price", "12000");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post(endpoint)
		.then()
		.statusCode(200)
		.log().all();
	}
}
