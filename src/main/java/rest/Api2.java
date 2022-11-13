package rest;

import org.json.simple.JSONObject; 


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in";
		
		
		RequestSpecification request1 = RestAssured.given();
		
        request1.header("Content-Type", "application/json");
        
        JSONObject req8= new JSONObject();
        
        req8.put("name", "morpheus");
        req8.put("job", "leader");
        
        request1.body(req8.toJSONString());
        
        Response response=request1.put("/api/users");
        
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
	}
	
}
