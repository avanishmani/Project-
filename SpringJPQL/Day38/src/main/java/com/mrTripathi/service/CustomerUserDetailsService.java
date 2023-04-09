package com.mrTripathi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mrTripathi.model.Customer;
import com.mrTripathi.repository.CustomerRepository;
@Service
public class CustomerUserDetailsService implements UserDetailsService {
	@Autowired
	private CustomerRepository cu;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Customer> opt=cu.findByEmail(username);
		if(opt.isPresent()) {
			Customer c=opt.get();
			List<GrantedAuthority> auth=new ArrayList<>();
			auth.add(new SimpleGrantedAuthority(c.getEmail()));
			return new User(c.getEmail(), c.getPassword(), auth);
		}else {
			throw new BadCredentialsException("UserDetails not found with Username"+ username);
		}
		
	}

}
