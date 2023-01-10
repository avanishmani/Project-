package com.masai.Dao;

import com.masai.exception.CourseException;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentDao {
String registerStudent(Student st) throws StudentException;
String startnewCourse(String cname,String duration) throws CourseException;
String enrollStudentInCourse(int roll,int cid) throws StudentException,CourseException;
}
