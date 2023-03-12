package com.masai.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {
//	String name
	@RequestMapping("/say")
       public void sayHello(String name){
		System.out.println("Welcome "+name);

		}

}
