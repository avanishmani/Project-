package com.mr.tripathi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mr.tripathi.Service.Service;

@SpringBootApplication
public class Day28Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Day28Application.class, args);
		Service s= ctx.getBean("service",Service.class);
		s.check();
	}

}
