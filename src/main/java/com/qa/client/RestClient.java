/**
 * 
 */
package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;




/**
 * Class created to capture rest methods.
 * @param <JsonPath>
 *
 */
public class RestClient{
	
	public JSONObject responsejson;
	
	
	public void get(String url) throws ClientProtocolException, IOException {		
	  CloseableHttpClient httpClient = HttpClients.createDefault();
	  HttpGet httpGet = new  HttpGet(url);  //GET REQUEST
	  CloseableHttpResponse httpResponse = httpClient.execute(httpGet);  //HIT THE URL	
	  //Status Code
	  int statusCode = httpResponse.getStatusLine().getStatusCode();
  	  System.out.println("Status Code -->" + statusCode);
  	  Assert.assertEquals(statusCode, 200);
  	 		  
  	    	  
  	  //ResponseBody
  	   String responseString =   EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
  	   JSONObject responseJson = new JSONObject(responseString);    	  
  	   System.out.println("Response JSON from API-->" + responseJson);  	   
  	   
  	   //Last Name validation
	   System.out.println(responseJson.get("last"));   
 	   Assert.assertEquals(responseJson.get("last"),"Doe");
  	  
  	     	   
  	   //Gender validation  	   
  	   System.out.println(responseJson.get("gender"));
  	   Assert.assertEquals(responseJson.get("gender"),"M");
  	   
  	   //Name validation
  	   System.out.println(responseJson.get("name"));
  	   Assert.assertEquals(responseJson.get("name"),"John");
  	   
  	   //Id validation
  	     	   
  	   System.out.println(responseJson.get("id"));
  	   Assert.assertEquals(responseJson.get("id"), 1);
  	   
  	   //Age validation
 	   System.out.println(responseJson.get("age"));
 	   Assert.assertEquals(responseJson.get("age"),40);
  	

  	   //System.out.println(jsonpath.get("City"));
  	   
  	   //Headers
  	   Header[] headersArray = httpResponse.getAllHeaders();
  	   HashMap<String,String> allHeaders = new HashMap<String,String>();
  	   
  	   for(Header header : headersArray) {
  		   allHeaders.put(header.getName(),header.getValue());
  	   }
  	   
  	   System.out.println("Headers Arry ---> " + allHeaders);
  	   
  	   
  	   //Response time validation
  	  
	  
		
	}
	

}
