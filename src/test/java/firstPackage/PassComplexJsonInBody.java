package firstPackage;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassComplexJsonInBody 
{

	public static void main(String[] args) 
	{
	  HashMap<String,Object> map = new HashMap<String,Object>();
	  map.put("email","rahul@gmail.com");
	  map.put("firstName","Rahul");
	  map.put("lastName","Arora");
	  
	  ArrayList<Integer> listOfMobileNumbers = new ArrayList<Integer>();
	  listOfMobileNumbers.add(98480888);
	  listOfMobileNumbers.add(98480999);
	  
	  map.put("mobile", listOfMobileNumbers);
	  
	  HashMap<String,String> address = new HashMap<String,String>();
	  address.put("flatNo","A-131");
	  address.put("city","New Delhi");
	  address.put("State","Delhi");
	  address.put("country","India");
	  
	  map.put("address", address);
	  
	  
	  Response response = given().contentType(ContentType.JSON).body(map).log().all()
		         .post("http://localhost:8080/api/users");
		  
		  response.prettyPrint();
		  
		  System.out.println(response.getStatusCode());

		 
	}

}
