package com.mrTripathi.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrTripathi.model.Customer;
import com.mrTripathi.repository.CustomerRepository;

@RestController
public class LoginController {
 @Autowired
	private CustomerRepository cr;
	
 @GetMapping("/signIn")
 public ResponseEntity<Customer> getLogginCustomer(Authentication auth){
	 Customer cu=cr.findByEmail(auth.getUsername()).orElseThrow(()-> new BadCredentialsException("No Such User Exsit !"));
	 return new ResponseEntity<Customer>(cu,HttpStatus.ACCEPTED);
 }
}
