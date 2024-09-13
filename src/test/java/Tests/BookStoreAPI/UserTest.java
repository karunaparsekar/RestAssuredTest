package Tests.BookStoreAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static Tests.BookStoreAPI.APIUtils.*;

public class UserTest extends BaseTest{
	
	private String userId, token;
	UserPOJO user = new UserPOJO("SiddhiShah", "Asdfgh@123");
	
	@Test(priority = 0)
	public void addUserTest() {
		System.out.println(user.toString());
		
		Response response = postRequest("/Account/v1/User", user);
		userId = response.jsonPath().getString("userID");
		//System.out.println(response.jsonPath().getString("userID"));
		Assert.assertEquals(response.getStatusCode(), 201);
		
		
	}
	
	
	@Test(priority = 1)
	public void generateTokenTest() {
			
		Response response = postRequest("/Account/v1/GenerateToken", user);
		token = response.jsonPath().getString("token");
		//System.out.println(response.jsonPath().getString("token"));
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	@Test(priority = 2)
	public void getUserTest() {
		//System.out.println("/Account/v1/User/" + userId);
		Response response = getRequest("/Account/v1/User/" + userId, token);
		System.out.println(response.prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("userId"), userId);
		Assert.assertEquals(response.jsonPath().getString("username"), user.getUserName());
		
		
	}
	
	
	
}
