package com.mrtripathi.controller;

import java.security.Principal;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mrtripathi.model.UserDtls;
import com.mrtripathi.repository.UserRepository;



@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		UserDtls user = userRepo.findByEmail(email);

		 m.addAttribute("user", user);

	}

	@GetMapping("/")
	public String home() {
		return "user/home";
	}

}
