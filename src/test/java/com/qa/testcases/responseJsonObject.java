/**
 * 
 */
package com.qa.testcases;

/**
 * This class is created to set getters and setters on the response data variables.
 *
 */
public class responseJsonObject {
	
	public Integer id;
	public String last;
	public String name;
	public String gender;
	public Integer age;
	
	public Integer getId(Object object) {
		return id;
	}
	public void setId(Object object) {
		this.id = (Integer) object;
	}
	public String getLast() {
		return last;
	}
	public String setLast(String last) {
		return this.last = last;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public int setAge(Integer age) {
		return this.age = age;
	}
	
	

}
