package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:Customer.properties")
public class Customer implements Human {
	@Value("${cust.id}")
	private int CustomerId;

	@Value("${cust.name}")
	private String name;

	private Address add;

	public Customer() {
		super();
	}

	@Autowired
	public Customer( @Qualifier("officeAddress") Address add) {
		super();
		
		this.add = add;
	}

	@Override
	public String getHuman() {
		// TODO Auto-generated method stub
		return CustomerId+" "+name+" "+add.getAddress();
	}

}
