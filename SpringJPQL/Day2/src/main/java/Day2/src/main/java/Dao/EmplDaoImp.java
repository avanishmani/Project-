package Day2.src.main.java.Dao;

import javax.persistence.EntityManager;

import Day2.src.main.java.Exception.EmployeeException;
import Day2.src.main.java.Utility.Emutil;
import Day2.src.main.java.model.Employee;

public class EmplDaoImp implements EmplDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee emp=null;
		EntityManager em=Emutil.provideEM();

		if(employee.getAddress()!=null && employee.getName()!=null && employee.getSalary()!=0) {
			emp=employee;
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			em.close();
			return emp;
		}else {
			throw new EmployeeException("Not Able to Insert data ");
		}

	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em=Emutil.provideEM();

		Employee emp=em.find(Employee.class, empId);
		if(emp!=null) {

			return emp;
		}else {
			throw new EmployeeException("No Such Employee Exist in the company ");
		}

	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub

		EntityManager em=Emutil.provideEM();

		Employee emp=em.find(Employee.class, empId);
		if(emp!=null) {
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			em.close();
			return emp;
		}else {
			throw new EmployeeException("No Such Employee Exist in the company ");
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		EntityManager em=Emutil.provideEM();

		Employee emp=em.find(Employee.class, employee.getEmpID());
		if(emp!=null) {
			em.getTransaction().begin();
			emp.setSalary(employee.getSalary());
			emp.setAddress(employee.getAddress());
			emp.setName(employee.getName());
			em.merge(emp);
			em.getTransaction().commit();
			em.close();
			return emp;
		}else {
			throw new EmployeeException("Employee Details Are not Updated"+ employee.getName());
		}

	}

}
