package com.restAssured;

import org.testng.annotations.Test;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class FakerDataGenerater {
	
	@Test
	void testFakedataGenerater() {
		
		Faker faker=new Faker();
		String username = faker.name().username();
		String password = faker.internet().password();
		String fullName = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String phone = faker.phoneNumber().cellPhone();
		String streetAddress = faker.address().streetAddress();
		
		System.out.println("UserName : "+username);
		System.out.println("password : "+password);
		System.out.println("fullName : "+fullName);
		System.out.println("firstName : "+firstName);
		System.out.println("lastName : "+lastName);
		System.out.println("phone : "+phone);
		System.out.println("streetAddress : "+streetAddress);
	
	}

}
