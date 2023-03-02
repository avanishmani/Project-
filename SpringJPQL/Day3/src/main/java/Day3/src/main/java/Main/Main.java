package Day3.src.main.java.Main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import Day3.src.main.java.Dao.EmplDao;
import Day3.src.main.java.Dao.EmplDaoImpl;
import Day3.src.main.java.Exception.EmployeeException;
import Day3.src.main.java.Model.Employee;
import Day3.src.main.java.Utiltiy.Emutil;

public class Main {

	public static void main(String[] args) {
	
	               EntityManager em= Emutil.provideEM();
	               EmplDao dao=new EmplDaoImpl();
	               Scanner sc=new Scanner(System.in);
	               System.out.println("press 1 for Get All Employees Details !");
	               System.out.println("press 2 for Get All Employees Details By Address !");
	               System.out.println("press 3 for Get All Employees Details With Range Salary !");
	               System.out.println("press 4 for Get All Employees Name And Salary !");
	               System.out.println("press 5 for Get  Employees Salary By Id !");
	               int x=sc.nextInt();
	               if(x==1) {

	            	try {
						List <Employee> li= dao.getAllEmployees();
						li.forEach(e-> System.out.println(e.toString()));
					} catch (EmployeeException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
	            	Main.main(args);
	               }else if(x==2) {
	            	   System.out.println("Enter The Address !");
	            	   String add=sc.next();
	            	   try {
						List <Employee> li= dao.getEmployeesByAddress(add);
						li.forEach(e-> System.out.println(e.toString()));
	   				} catch (EmployeeException e) {
	   					// TODO Auto-generated catch block
	   					System.out.println(e.getMessage());
	   				}
	               	Main.main(args);
	               }else if(x==3) {
	            	   System.out.println("Enter The Start Salary !");
	            	   int start=sc.nextInt();
	            	   System.out.println("Enter The End Salary !");
	            	   int end=sc.nextInt();
	            	   try {
						List <Employee> li= dao.getAllEmployeeWithRangeSalary(start, end);
						li.forEach(e-> System.out.println(e.toString()));
	   				} catch (EmployeeException e) {
	   					// TODO Auto-generated catch block
	   					System.out.println(e.getMessage());
	   				}
	               	Main.main(args);
	               }else if(x==4) {
	            	   System.out.println("Enter The Eid of Employee !");
	            	   int eid=sc.nextInt();

	            	   try {
						Object[] arr= dao.getEmployeeNameAndSalary(eid);
						System.out.println(arr[0]);
						System.out.println(arr[1]);
	   				} catch (EmployeeException e) {
	   					// TODO Auto-generated catch block
	   					System.out.println(e.getMessage());
	   				}
	               	Main.main(args);
	               }else if(x==5) {
	            	   System.out.println("Enter The Eid of Employee !");
	            	   int eid=sc.nextInt();

	            	   try {
						int arr= dao.getEmployeeSalaryById(eid);
						System.out.println(arr);
	   				} catch (EmployeeException e) {
	   					// TODO Auto-generated catch block
	   					System.out.println(e.getMessage());
	   				}
	               	Main.main(args);
	               }else {
	            	   System.out.println("Wrong Input Please Enter A valid Number !");
	            		Main.main(args);
	               }
		}

}
