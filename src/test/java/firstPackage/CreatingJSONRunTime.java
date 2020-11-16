package firstPackage;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatingJSONRunTime 
{

	public static void main(String[] args) 
	{
	   JSONObject jsonObject = new JSONObject();
	   jsonObject.put("email", "msd@gmail.com");
	   jsonObject.put("firstName", "Mahendra");
	   jsonObject.put("lastName", "Singh");
	   
	   JSONArray jsonArray = new JSONArray();
	   jsonArray.put(98480888);
	   jsonArray.put(98480999);
	   
	   jsonObject.put("mobile", jsonArray);
	   
	   
	   JSONObject address = new JSONObject();
	   
	      address.put("flatNo","A-131");
		  address.put("city","New Delhi");
		  address.put("State","Delhi");
		  address.put("country","India");
		 
	 
	   jsonObject.put("address", address);
		   	  
	   Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).log().all()
		         .post("http://localhost:8080/api/users");
		  
		  response.prettyPrint();
		  
		  System.out.println(response.getStatusCode());

	}

}
