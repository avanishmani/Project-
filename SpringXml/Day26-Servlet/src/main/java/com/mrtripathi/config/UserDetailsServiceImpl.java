package com.mrtripathi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mrtripathi.model.UserDtls;
import com.mrtripathi.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		UserDtls user = userRepo.findByEmail(email);

		if (user != null) {
			return new CustomUserDetails(user);
		}

		throw new UsernameNotFoundException("user not available");
	}


}
