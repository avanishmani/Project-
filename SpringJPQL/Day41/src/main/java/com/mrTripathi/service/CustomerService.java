package com.mrTripathi.service;

import com.mrTripathi.Exception.CustomerException;
import com.mrTripathi.model.Customer;

import java.util.*;

public interface CustomerService {
	public Customer registerCustomer(Customer customer) ;

	public Customer getCustomerDetails(String email) throws CustomerException;

	public List<Customer> getAllCustomerDetails() throws CustomerException;
}
