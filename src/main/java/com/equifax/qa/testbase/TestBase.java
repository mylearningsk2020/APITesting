/**
 * 
 */
package com.equifax.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Test Base class created as part of Equifax assignment.
 *
 */
public class TestBase {
	
	public Properties prop;
	
	public TestBase() { 		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch(IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
}