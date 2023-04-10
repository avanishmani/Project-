package com.mrTripathi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mrTripathi.model.Customer;
import com.mrTripathi.repository.CustomerRepository;

public class MyAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	private CustomerRepository cRepo;
	@Autowired
	private PasswordEncoder pEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username=authentication.getName();
		String pwd=authentication.getCredentials().toString();
		Optional<Customer>opt=cRepo.findByEmail(username);
		if(!opt.isPresent()) {
			throw new BadCredentialsException("No User Registered withthis Details");
		}else {
			Customer customer=opt.get();
			if(pEncoder.matches(pwd, customer.getPassword())) {
				List<GrantedAuthority>authorities=new ArrayList<>();
				return new UsernamePasswordAuthenticationToken(username, pwd,authorities);
			}else {
				throw new BadCredentialsException("Invalid Password");
			}
		}
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
		
	}

}
