package firstPackage;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class ValidateJSONResponse 
{

	public static void main(String[] args) 
	{
	  Response response = given().auth().basic("sk_test_51Hg2xUERu8sF3Rkwiftmh6IIpJSb3kDdgskqWr0q00pDOOhCjJ7Nsu2Ld1odh54PNmMYGvXOxHGk1MX7N8ijDS1600WQ9GR20l","")
	         .formParam("name", "SRK K").formParam("email","pujitha@way2auto.com")
	         .formParam("address[line1]", "A-131 New Delhi")
	         .formParam("preferred_locales[0]", "Yes")
	         .formParam("preferred_locales[1]", "No")
	         .post("https://api.stripe.com/v1/customers");
	  
	  response.prettyPrint();
	  
//	  JsonPath json = response.jsonPath();
//	  System.out.println(json.get("id"));
 
	  System.out.println(response.jsonPath().get("id"));
	  
	  System.out.println(response.jsonPath().get("name"));
	  
	  System.out.println(response.jsonPath().get("address.line1"));
	  
	  System.out.println(response.jsonPath().get("preferred_locales[0]"));
	  
	  System.out.println(response.jsonPath().getMap("$").size());
	  
	  System.out.println(response.jsonPath().getMap("address").size());
	  
	  System.out.println(response.jsonPath().getList("preferred_locales").size());
	  
	}

}
