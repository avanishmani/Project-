package com.masai.usecase;

import java.util.Scanner;

import com.masai.Dao.StudentDao;
import com.masai.Dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Address");
		String add=sc.next();
		System.out.println("Enter Student Email ");
		String email=sc.next();
		Student st=new Student();
		st.setName(name);
		st.setAddress(add);
		st.setEmail(email);
		StudentDao sd=new StudentDaoImpl();
		try {
			String msg=sd.registerStudent(st);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
		System.out.println(	e.getMessage());
		}
		
	}

}
