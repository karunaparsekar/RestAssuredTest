package Tests.WeatherAPITest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import io.restassured.specification.RequestSpecification;


public class BaseTest {
	protected static RequestSpecification requestSpec;
	
	@BeforeClass
	public void setup() {
		requestSpec = given().
			baseUri("https://api.openweathermap.org/data/2.5").
			queryParam("appid", "f74687f81bf34807ed4a17c1dcff8593").
			header("Content-Type", "application/json");
			
	}

}
