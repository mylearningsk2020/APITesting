/**
 * 
 */
package com.qa.testcases;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.equifax.qa.testbase.TestBase;
import com.qa.client.RestClient;





/**
 * TestNG class designed to call the methods from RestClient class
 *
 */
public class GetAPITest extends TestBase {
	
	TestBase testbase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testbase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		
		url = serviceUrl+apiUrl;
		restClient = new RestClient();
		restClient.get(url);	
		
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		restClient.get(url);
		
	
			}
	
		
		
	}

