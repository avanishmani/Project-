package com.mr.tripathi.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mr.tripathi.model.Student;

@RestController
public class Main {

//	List<Student> students = new ArrayList<>();
	@GetMapping("/Student")
	public ResponseEntity<String> Welcome() {
		
		return new ResponseEntity<String>("WElcome Back", HttpStatus.OK);
	}
	@GetMapping("/Student/{roll}/{batch}/{marks}")
	public ResponseEntity<Student> addStudent(@PathVariable("roll") Integer roll,@PathVariable("batch") String batch, @PathVariable("marks") Integer marks) {
		Student st = new Student(roll, batch, marks, LocalDateTime.now());
		return new ResponseEntity<Student>(st, HttpStatus.CREATED);
	}
}
