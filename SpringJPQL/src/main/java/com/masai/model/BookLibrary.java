package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookLibrary {
//	Book Id : 101,
//	name: "C++",
//author: "Nitesh",
//publication: "Rajput Publication",
//category: "Computer Programming",
//pages: 1500,
//price: 240,
//created_timestamp : 2019-12-11 10:58:37
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Bookid;
	private String bame;
	private String author;
	private String publication;
	private String category;
	private int pages;
	private int price;
	private LocalDate created_timestamp;

}
