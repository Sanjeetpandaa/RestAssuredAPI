package apitesting;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

public class SendGetRequestUsingRestAssured {

	public static void main(String[] args) {
		
		/*
		 * Response response=given().get("https://reqres.in/api/users/2");
		 * response.prettyPrint();
		 */
		
		/*
		 * Response response=given().get("https://reqres.in/api/users/23");
		 * response.prettyPrint(); System.out.println(response.statusCode());
		 */
		
		Response response= given().get("https://reqres.in/api/unknown");
		response.prettyPrint();
		System.out.println(response.statusCode());
          
	}

}
