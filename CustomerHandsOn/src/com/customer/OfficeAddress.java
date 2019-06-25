package com.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:OfficeAddress.properties")
public class OfficeAddress implements Address {
	@Value("${office.city}")
	private String city;
	
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return city;
	}

}
