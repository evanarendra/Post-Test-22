package com.juaracoding.restassured;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGetProduct{

	String endpoint = "https://mern-backend-8881.herokuapp.com/product?page=1";
	@Test
	public void testStatusCode() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		int actual = response.getStatusCode();
		assertEquals(actual, 200);
	}
	@Test
	public void testGet() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("category", hasItems("Cruiser"))
		.log().all();
	}
	@Test
	public void testPatch() {
		
	}
	@Test
	public void testDelete() {
		
	}
}
