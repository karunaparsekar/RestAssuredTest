package Data;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	public static String cityName = "Cary";
	public static String countryCode = "us";
	
	@DataProvider(name = "weatherAttribute")
	public static Object[][] provideWeatherAttribute(){
		return new Object[][] {
			{"q", cityName},						//city name
			{"id", 4459467}							//city id
		};
	}
	
	
	@DataProvider(name = "weatherAttributes")
	public static Object[][] provideWeatherAttributes(){
		return new Object[][] {
			{"lat", 35.7915, "lon", -78.7811 }	//Latitude and Longitude
						//zipcode with country
		};
	}
	
	@DataProvider(name = "weatherWithCountryCode")
	public Object[][] provideWeatherWithCountryCode(){
		return new Object[][] {
			{"zip", 27519, countryCode},
			{"zip", 60013, countryCode},//zipcode with country
			{"q", cityName, countryCode}
		};
	}
	

}
