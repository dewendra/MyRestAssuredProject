package com.restAssured;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//POJO ---->JSON Object----Serialization

//JSON----->POJO -----De-serialization


public class SerializationAndDeserialization {
	
	//converting POJO to JSON Object
	
	//@Test
	void convertPojoToJson() throws JsonProcessingException {
		
		//created java object using pojo class
		Student studentPojo=new Student();//pojo class object
		studentPojo.setId(101);
		studentPojo.setName("John");
		studentPojo.setLoaction("Mumbai");
		studentPojo.setPhone("9876543210");
		String courseArray[]= {"C","C++","Java"};
		studentPojo.setCourse(courseArray);
		
		
		//converted java object------> Json object(serialization)
		
		ObjectMapper objMapper= new ObjectMapper();
		String jsondata = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentPojo);
		System.out.println(jsondata);
		
	}
	
	//Converting JSON object to POJO(De-serialization)
	@Test
	void convertJsonToPojo() throws JsonProcessingException {
		
		String jsonData= "{\r\n"
				+ "  \"id\" : 101,\r\n"
				+ "  \"name\" : \"John\",\r\n"
				+ "  \"loaction\" : \"Mumbai\",\r\n"
				+ "  \"phone\" : \"9876543210\",\r\n"
				+ "  \"course\" : [ \"C\", \"C++\", \"Java\" ]\r\n"
				+ "}";
		
		
		
		//converted JSON object------> Pojo object(De-serialization)
		
		ObjectMapper objMapper= new ObjectMapper();
		Student studentPojo = objMapper.readValue(jsonData, Student.class);
		studentPojo.getId();
		System.out.println("Id:"+studentPojo.getId());
		System.out.println("Name:"+studentPojo.getName());
		System.out.println("Location:"+studentPojo.getLoaction());
		System.out.println("Phone:"+studentPojo.getPhone());
		System.out.println("Course 1:"+studentPojo.getCourse()[0]);
		System.out.println("Course 2:"+studentPojo.getCourse()[1]);
		System.out.println("Course 3:"+studentPojo.getCourse()[2]);
		
		
	}
	

}
