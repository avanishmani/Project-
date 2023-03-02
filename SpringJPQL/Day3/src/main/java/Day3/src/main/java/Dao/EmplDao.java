package Day3.src.main.java.Dao;

import java.util.List;

import Day3.src.main.java.Exception.EmployeeException;
import Day3.src.main.java.Model.Employee;

public interface EmplDao {
	public List<Employee> getAllEmployees() throws EmployeeException;
	public List <Employee> getEmployeesByAddress(String address) throws EmployeeException;
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary,int endSalary) throws EmployeeException;
	public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
	public int getEmployeeSalaryById(int empId)throws EmployeeException;
}
