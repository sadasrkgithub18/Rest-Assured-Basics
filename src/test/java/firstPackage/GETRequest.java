package firstPackage;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GETRequest 
{

	public static void main(String[] args) 
	{
	     //Response response = given().params("limit",3).auth().basic("sk_test_51Hg2xUERu8sF3Rkwiftmh6IIpJSb3kDdgskqWr0q00pDOOhCjJ7Nsu2Ld1odh54PNmMYGvXOxHGk1MX7N8ijDS1600WQ9GR20l", "").get("https://api.stripe.com/v1/customers");
	  
	     
	     Response response = given().auth().basic("sk_test_51Hg2xUERu8sF3Rkwiftmh6IIpJSb3kDdgskqWr0q00pDOOhCjJ7Nsu2Ld1odh54PNmMYGvXOxHGk1MX7N8ijDS1600WQ9GR20l", "")
	    		                    .formParams("limit",3).formParams("email","msd@way2auto.com").get("https://api.stripe.com/v1/customers");
		  
	     // response.prettyPrint();
	     
	     String jsonResponse = response.asString();
	     System.out.println(jsonResponse);
	     
	     System.out.println("Response code is:--> "+response.statusCode());
	     
	   // given().contentType(ContentType.JSON);
	  
	   // given().contentType("application/json");
		
	   // given().header("content-type","application/json").auth().basic("", "");
	}

}
