package Tests.WeatherAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTest {
	
	@Test
	public void getUsers() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		int status_code = response.getStatusCode();
		
		System.out.println("status_code is " + status_code);
		System.out.println(response.asPrettyString());
		System.out.println(response.getHeader("content-type"));
		
		
		Assert.assertEquals(status_code, 200);
		
	}
}
