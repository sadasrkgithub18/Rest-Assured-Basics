package firstPackage;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTRequestUsingJSON 
{

	public static void main(String[] args) 
	{
	  String bodyString = "{\"email\":\"morpheus\",\"job\":\"leader\"}"; 	
	  Response response = given().contentType(ContentType.JSON).body(bodyString)
	         .post("https://reqres.in/api/users");
	  
	  response.prettyPrint();
	}

}
