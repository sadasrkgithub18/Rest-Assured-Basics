package firstPackage;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTUsingHashMap 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("email","morpheus");
		map.put("job","leader");
		
		
		Response response = given().contentType(ContentType.JSON).body(map)
		         .post("https://reqres.in/api/users");
		  
		  response.prettyPrint();

	}

}
