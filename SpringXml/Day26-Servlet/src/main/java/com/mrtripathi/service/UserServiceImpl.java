package com.mrtripathi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mrtripathi.model.UserDtls;
import com.mrtripathi.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BCryptPasswordEncoder passwordEncode;
	@Override
	public UserDtls createUser(UserDtls user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_USER");

		return userRepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.existsByEmail(email);
	}

}
