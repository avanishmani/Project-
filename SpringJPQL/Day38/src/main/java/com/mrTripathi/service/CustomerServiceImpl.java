package com.mrTripathi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrTripathi.Exception.CustomerException;
import com.mrTripathi.model.Customer;
import com.mrTripathi.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository cr;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return cr.save(customer);
	}

	@Override
	public Customer getCustomerDetails(String email) throws CustomerException {
		// TODO Auto-generated method stub
		return cr.findByEmail(email)
				.orElseThrow(() -> new CustomerException("Customer Not found with provide email !"));
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		List<Customer> li = cr.findAll();
		if (li.isEmpty()) {
			throw new CustomerException("No Customer Found !");
		}
		return li;
	}

}
