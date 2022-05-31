package apitesting;

import io.restassured.response.Response;
public class SendingPostRequestUsingRestAssured {

	public static void main(String[] args) {
		
		given().get("https://reqres.in/api/users").body()

	}

}
