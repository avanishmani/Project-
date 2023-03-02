package Day3.src.main.java.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import Day3.src.main.java.Exception.EmployeeException;
import Day3.src.main.java.Model.Employee;
import Day3.src.main.java.Utiltiy.Emutil;

public class EmplDaoImpl implements EmplDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> li=null;
		EntityManager em= Emutil.provideEM();
		String jpql="From Employee";
		Query q=em.createNamedQuery(jpql);
		li=q.getResultList();
		if(li!=null) {
		return li;
	}else {
		throw new EmployeeException("No Data Are Avilable");
	}
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> li=null;
		EntityManager em= Emutil.provideEM();
		String jpql="From Employee where address = :add";
		Query q=em.createNamedQuery(jpql);
		q.setParameter("add", address);
		li=q.getResultList();
		if(li!=null) {
		return li;
	}else {
		throw new EmployeeException("There IS no Any Employee From "+ address);
	}
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> li=null;
		EntityManager em= Emutil.provideEM();
		String jpql="From Employee where salary <= :add And salary <=fin";
		Query q=em.createNamedQuery(jpql);
		q.setParameter("add", startSalary);
		q.setParameter("fin", endSalary);
		li=q.getResultList();
		if(li!=null) {
		return li;
	}else {
		throw new EmployeeException("There IS no Any Employee in salary range of"+ startSalary+ "to"+ endSalary);
	}
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		Object[] arr=null;
		EntityManager em= Emutil.provideEM();
		String jpql="select name,salary from Employee where empID=:id ";
		Query q=em.createNamedQuery(jpql);
		q.setParameter("id", empId);
		arr=(Object[]) q.getSingleResult();
		if(arr!=null) {
			return arr;
		}else {
			throw new EmployeeException("No Such EMployee Exsist ! ");
		}


	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		int x=0;

		EntityManager em= Emutil.provideEM();
		String jpql="select salary from Employee where empID=:id ";
		Query q=em.createNamedQuery(jpql);
		q.setParameter("id", empId);
		x=(int) q.getSingleResult();
		if(x!=0) {
			return x;
		}else {
			throw new EmployeeException("No Such EMployee Exsist ! ");
		}
	}


}
