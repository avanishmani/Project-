package com.mr.tripathi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Main {
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to First Spring Boot Project !";
	}
}
