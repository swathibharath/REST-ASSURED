package rest;

import java.io.IOException; 

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class test {
	@Test
	public  void getmethod() throws IOException
	{
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification request1 = RestAssured.given();
        request1.header("Content-Type", "application/json");
        Response response = request1.request(Method.GET, "");
        
        generic gm=new generic();
		String sr=gm.filereader("baseURI");
		RestAssured.baseURI =sr;
        
        JsonPath jp = response.jsonPath();
        System.out.println( jp.get("total_pages").toString());
	    Assert.assertEquals(jp.get("total_pages").toString(), "2");
        System.out.println(response.getBody().asString());
        
        System.out.println(request1.request(Method.GET, "").getStatusCode());
        Assert.assertEquals( request1.request(Method.GET, "").getStatusCode(),constants.GET_STATUSCODE);
    
 	}
	
	
}

