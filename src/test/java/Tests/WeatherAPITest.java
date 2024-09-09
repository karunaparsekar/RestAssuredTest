package Tests;

import Data.DataProviderClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class WeatherAPITest extends BaseTest{
	
	
	@Test(dataProvider = "weatherAttribute", dataProviderClass = DataProviderClass.class)
	public void retrieveWeather(Object queryParamName, Object queryParamValue) {

		requestSpec.
			get("/weather?" + queryParamName + "=" + queryParamValue).
		then().
			statusCode(200).
			log().all().
			body("name", equalTo(DataProviderClass.cityName));
			
		
	}
	
	
	@Test(dataProvider = "weatherAttributes", dataProviderClass = DataProviderClass.class)
	public void retrieveWeather(Object queryParamName1, Object queryParamValue1, Object queryParamName2, Object queryParamValue2) {
				
		requestSpec.
			queryParam((String)queryParamName1, queryParamValue1).
			queryParam((String)queryParamName2, queryParamValue2).
		when().
			get("/weather").
		then().
			statusCode(200).
			body("name", equalTo(DataProviderClass.cityName));
			
		
	}
	
	@Test(dataProvider = "weatherWithCountryCode", dataProviderClass = DataProviderClass.class)
	public void retrieveWeather(Object queryParamName, Object queryParamValue, String countryCode) {
		System.out.println("Test for " + queryParamName + " " + queryParamValue + " " +  countryCode);
		
		requestSpec.
		queryParam((String)queryParamName, queryParamValue + "," + countryCode).
	when().
		get("/weather").
	then().
		statusCode(200).
		log().all().
		body("name", equalTo(DataProviderClass.cityName));
			
		
	}
	
	
	
}
