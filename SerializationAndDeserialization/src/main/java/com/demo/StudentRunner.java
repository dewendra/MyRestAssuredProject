package com.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class StudentRunner {

	public static void main(String[] args) throws JsonProcessingException {
		
		Student student=new Student(1001, "Alok Singh","Java");
		System.out.println(student);
		
		//Using Gson
		//Serialization- Convert Java object to JSON object
		System.out.println("---------------Gson Library---------------");
		Gson gson=new Gson();
		String jsonData=gson.toJson(student);
		System.out.println(jsonData);
		
		//Deserialization- Convert JSON data to Java object

		String jsondata="{\"stdId\":1002,\"stdName\":\"Prachi Singh\",\"stdCourse\":\"Python\"}";
		 Student student2=gson.fromJson(jsondata, Student.class);
		 System.out.println(student2);
		 
		 //Using Jackson
		//Serialization- Convert Java object to JSON object
		 System.out.println("---------------Jackson Library---------------");
		 ObjectMapper mapper=new ObjectMapper();
		 String jacksonData=mapper.writeValueAsString(student);
		 String jacksonData1=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		 System.out.println(jacksonData);
		 System.out.println(jacksonData1);
		 
		 
		//Deserialization- Convert JSON data to Java object
		 String jacksondata="{\"stdId\":1002,\"stdName\":\"Prachi Singh\",\"stdCourse\":\"Python\"}";
		Student student3= mapper.readValue(jacksondata, Student.class);
		System.out.println(student3);
		 
	}

}
