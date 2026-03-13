package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CustomerDao;
import com.tka.model.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;

	public boolean addCustomer(Customer customer) {
		customerDao.save(customer);
		return true;
	}

	public Customer verifyLoginCred(String userName, String password) {

	    Customer customer = customerDao.findByUserNameAndPassword(userName, password);

	    if(customer != null) {
	        System.out.println("Login Success");
	        return customer;
	    }
	    System.out.println("login failed");
    
	    return null;
	}

	

	
}
