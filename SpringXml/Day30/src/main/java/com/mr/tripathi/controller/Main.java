package com.mr.tripathi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mr.tripathi.model.Student;

@RestController
public class Main {

	List<Student> list=new ArrayList<>();
	public Main() {
		list.add(new Student(1,"Amt","Java",1));
		list.add(new Student(2,"Bmt","DSA",5));
		list.add(new Student(3,"emt","React",2));
		list.add(new Student(4,"dmt","Spring",3));
		list.add(new Student(5,"cmt","JS",1));
	}
	@GetMapping("/student")
	public ResponseEntity<List<Student>> welcome(){
		return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
	}
}
