package com.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:Homeaddress.properties")
public class HomeAddress implements Address {
	@Value("${streetName}")
	private String streetName;
	@Value("${apartment}")
	private String apartment;

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return streetName + " " + apartment;
	}

}
