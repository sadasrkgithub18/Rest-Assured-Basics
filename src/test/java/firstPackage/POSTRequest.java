package firstPackage;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class POSTRequest 
{

	public static void main(String[] args) 
	{
	  Response response = given().auth().basic("sk_test_51Hg2xUERu8sF3Rkwiftmh6IIpJSb3kDdgskqWr0q00pDOOhCjJ7Nsu2Ld1odh54PNmMYGvXOxHGk1MX7N8ijDS1600WQ9GR20l", "")
	         .formParam("name","Suresh").formParam("email", "suresh@way2auto.com").formParam("description", "POST Request using Rest Assured")
	         .post("https://api.stripe.com/v1/customers");
	  
	  response.prettyPrint();
	}

}
