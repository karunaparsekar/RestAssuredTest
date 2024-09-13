package Tests.BookStoreAPI;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import io.restassured.specification.RequestSpecification;


public class BaseTest {
	protected static RequestSpecification requestSpec;
	
	@BeforeClass
	public void setup() {
		requestSpec = 
		given().
			baseUri("https://bookstore.toolsqa.com");
	
	}

}
