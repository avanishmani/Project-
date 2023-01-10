package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//loading the Driver related main class into the memory
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("Could not load the class !");
}
String url="jdbc:mysql://localhost:3306/project";
try(Connection conn=DriverManager.getConnection(url, "root", "root")) {
	//through normal Statement 
/*Statement st=conn.createStatement();
//insert student details 
int x=st.executeUpdate("insert into student values(1,'Avanish','Deoria','9451269954')");
*/
	//Through Prepared Satement 
//Inserting Student details using 
	/*	
	System.out.println("Enter the Student name");
	String name=sc.next();
	System.out.println("Enter the Student address");
	String add=sc.next();
	System.out.println("Enter the Student Contact number");
	String mob=sc.next();
	
	
	
	
	
PreparedStatement ps=conn.prepareStatement("insert into student value (?,?,?,?)");
ps.setInt(1, id);
ps.setString(2, name);
ps.setString(3, add);
ps.setString(4, mob);
int x=ps.executeUpdate();
if(x>0)
	System.out.println(x+" record is updated");
else
	System.out.println("something problem  is happening !");
	//updating the details 
	
	PreparedStatement ps=conn.prepareStatement("update Student set address= ? where roll = ?");
	System.out.println("Enter the Student ID");
	int id=sc.nextInt();
	System.out.println("Enter the Student address");
	String add=sc.next();
	ps.setString(1,add);
	ps.setInt(2,id);
	int x=ps.executeUpdate();
	if(x>0)
	System.out.println(x+" record is updated");
else
	System.out.println("something problem  is happening !");
	//Deleting of record 
	PreparedStatement ps=conn.prepareStatement("delete from student where roll = ?");
	System.out.println("Enter the Student roll");
	int roll=sc.nextInt();
	int x=ps.executeUpdate();
	ps.setInt(1,roll);
	if(x>0)
	System.out.println(x+" record is updated");
else
	System.out.println("something problem  is happening !");
	
	//Performing DRL operaiom(select operation)
	// if multiple result is coming
	PreparedStatement ps=conn.prepareStatement("Select * from student");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		 int roll=rs.getInt("roll");
		String name=rs.getString("sname");
		String add=rs.getString("address");
		String mob=rs.getString("mobile");
		System.out.println("Roll Number of Student :- "+ roll);
		System.out.println("Name of Student :- "+ name);
		System.out.println("Address of Student :- "+ add);
		System.out.println("Contact Number of Student :- "+ mob);
		System.out.println("============================================");
		
	}
*/
	//if single or zero result is coming
	PreparedStatement ps=conn.prepareStatement("Select * from student where roll= ?");
	System.out.println("Enter the Student roll");
	int rol=sc.nextInt();
	ps.setInt(1, rol);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		 int roll=rs.getInt("roll");
		String name=rs.getString("sname");
		String add=rs.getString("address");
		String mob=rs.getString("mobile");
		System.out.println("Roll Number of Student :- "+ roll);
		System.out.println("Name of Student :- "+ name);
		System.out.println("Address of Student :- "+ add);
		System.out.println("Contact Number of Student :- "+ mob);
		System.out.println("============================================");
		
	}else
		System.out.println("Student does not exist with the roll number :- "+rol);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
