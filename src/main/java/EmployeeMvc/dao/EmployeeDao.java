package EmployeeMvc.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import EmployeeMvc.dto.Employee;

@Component
public class EmployeeDao 
{
	@Autowired
	EntityManager em;
	
	public Employee saveEmployee(Employee emp)
	{
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		return emp;
	}
	
	public Employee findById(int empId)
	{
		return em.find(Employee.class, empId);
	}
	
	public Employee deleteEmployee(int empId)
	{
		Employee emp = findById(empId);
		if(emp != null)
		{
			em.getTransaction().begin();
			em.remove(emp);
			em.getTransaction().commit();
			return emp;
		}
		return null;
	}
	
	public Employee updateEmployee(Employee emp,int empId)
	{
		Employee exEmp = findById(empId);
		if(exEmp != null)
		{
			emp.setEmpId(empId);
			em.getTransaction().begin();
			Employee updatedEmp = em.merge(emp);
			em.getTransaction().commit();
			return updatedEmp;
		}
		return null;
	}
	
	public java.util.List<Employee> findAllEmployees()
	{
		javax.persistence.Query query =  em.createQuery("select e from Employee e");
		java.util.List<Employee> emps = query.getResultList();
		return emps;
	}
	
	public Employee findByEmail(String email)
	{
		javax.persistence.Query query = em.createQuery("select e from Employee e where e.empEmail=?1");
		query.setParameter(1, email);
		Employee emp = (Employee) query.getSingleResult();
		return emp;
	}
	
	
	
	
	
	
}
