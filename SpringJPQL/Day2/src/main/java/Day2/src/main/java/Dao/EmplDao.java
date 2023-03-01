package Day2.src.main.java.Dao;

import Day2.src.main.java.Exception.EmployeeException;
import Day2.src.main.java.model.Employee;

public interface EmplDao {
	public Employee registerEmployee(Employee employee)throws EmployeeException;
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	public Employee updateEmployee(Employee employee)throws EmployeeException;
}
