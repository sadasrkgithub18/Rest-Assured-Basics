package firstPackage;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class GETRequest2 
{

	public static void main(String[] args) 
	{
	 Response response = given().header("Authorization","Bearer sk_test_51Hg2xUERu8sF3Rkwiftmh6IIpJSb3kDdgskqWr0q00pDOOhCjJ7Nsu2Ld1odh54PNmMYGvXOxHGk1MX7N8ijDS1600WQ9GR20l")
	        .get("https://api.stripe.com/v1/customers/cus_IGaVHSF8lZ3UAP");
	
	 response.prettyPrint();
	 
	 System.out.println("Response code: -->"+response.statusCode());
	}

}
