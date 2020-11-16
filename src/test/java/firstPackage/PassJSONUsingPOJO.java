package firstPackage;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJSONUsingPOJO 
{

	public static void main(String[] args) 
	{
		User user = new User("nikiti@way2auto.com","Nikiti","Flora","A-131","New Delhi","Delhi","India");
		
		user.setMobileNumbers(2233888,2233999);
		
		Response response = given().contentType(ContentType.JSON).body(user).log().all()
		         .post("http://localhost:8080/api/users");
		  
		  response.prettyPrint();
		  
		  System.out.println(response.getStatusCode());

		
	}

}
