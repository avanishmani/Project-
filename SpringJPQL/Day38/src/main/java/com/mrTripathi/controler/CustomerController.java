package com.mrTripathi.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrTripathi.Exception.CustomerException;
import com.mrTripathi.model.Customer;
import com.mrTripathi.service.CustomerServiceImpl;

@RestController
public class CustomerController {
@Autowired
	private CustomerServiceImpl cs;
	@Autowired
	private PasswordEncoder psw;
	@GetMapping("/hello")
	public String testHandler() {
		return "Welcome to Spring Security !";
		
	}
	@PostMapping("/customers")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer cu){
		cu.setPassword(psw.encode(cu.getPassword()));
	Customer c=	cs.registerCustomer(cu);
	return new ResponseEntity<>(c,HttpStatus.ACCEPTED);
	}
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomers() throws CustomerException{
	
	List<Customer> c=cs.getAllCustomerDetails();
	return new ResponseEntity<>(c,HttpStatus.ACCEPTED);
	}
	@GetMapping("/customers/{email}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("email") String email) throws CustomerException{
	
	Customer c=cs.getCustomerDetails(email);
	return new ResponseEntity<>(c,HttpStatus.ACCEPTED);
	}
}
