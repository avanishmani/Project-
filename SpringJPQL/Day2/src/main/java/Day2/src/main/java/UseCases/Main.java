package Day2.src.main.java.UseCases;

import java.util.Scanner;

import Day2.src.main.java.Dao.EmplDao;
import Day2.src.main.java.Dao.EmplDaoImp;
import Day2.src.main.java.Exception.EmployeeException;
import Day2.src.main.java.model.Employee;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Table ");
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Select 1 for Creating Employee Profile !");
		System.out.println("Select 2 for Getting Employee By Id !");
		System.out.println("Select 3 for Delete Employee By Id !");
		System.out.println("Select 4 for update Employee balance And provide 5000 bonus !");
		x=sc.nextInt();
		if(x==1) {
			System.out.println("Employee Name");
			String name=sc.next();
			System.out.println("Employee Address");
			String add=sc.next();
			System.out.println("Employee Sallary !");
			int sal=sc.nextInt();
			Employee emp=new Employee(name, add, sal);
			   EmplDao em=new EmplDaoImp();
			   try {
				Employee e=em.registerEmployee(emp);
				System.out.println(e.toString());
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			   Main.main(args);
		}else if(x==2) {
			System.out.println("Employee EmpID !");
			int empID=sc.nextInt();
			 EmplDao em=new EmplDaoImp();
			 try {
					Employee e=em.getEmployeeById(empID);
					System.out.println(e.toString());
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			 Main.main(args);
		}else if(x==3) {
			int empID=sc.nextInt();
			 EmplDao em=new EmplDaoImp();
			 try {
					Employee e=em.deleteEmployeeById(empID);
					System.out.println(e.toString());
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			 Main.main(args);
		}else if(x==4) {
			Employee emp=new Employee();
			System.out.println("Employee EmpID whoom data you want to update!");
			int empID=sc.nextInt();
			emp.setEmpID(empID);
			System.out.println("Employee Name");
			String name=sc.next();
			emp.setName(name);
			System.out.println("Employee Address !");
			String add=sc.next();
			emp.setAddress(add);
			System.out.println("Employee sallary!");
			int sal=sc.nextInt();
			emp.setSalary(sal);
			EmplDao em=new EmplDaoImp();
			 try {
					Employee e=em.updateEmployee(emp);
					System.out.println(e.toString());
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			 Main.main(args);

		}else {
			System.out.println("Enter the valid Input");
			Main.main(args);
		}

	}

}
