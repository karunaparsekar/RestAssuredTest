package Tests.BookStoreAPI;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIUtils {
	
	//common get request
	public static Response getRequest(String endPoint) {
		
		return 
		given()
			.contentType(ContentType.JSON)
		.when()
			.get(endPoint);
					
		
	}
	
	
	//common post method
	public static Response postRequest(String endPoint, Object body) {
		return 
		given()
			.contentType(ContentType.JSON)
			.body(body)
		.when()
			.post(endPoint);
					

	}
	
	
	
	//common put method
	public static Response putRequest(String endPoint, Object body) {
		return 
		given()
			.contentType(ContentType.JSON)
			.body(body)
		.when()
			.put(endPoint);
					

	}
	
	
	//common delete method
	public static Response deleteRequest(String endPoint) {
		return 
		given()
			.contentType(ContentType.JSON)
		.when()
			.delete(endPoint);
					

	}
	
}
