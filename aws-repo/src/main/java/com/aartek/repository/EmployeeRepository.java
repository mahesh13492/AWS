package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void findName(String  name) {
		hibernateTemplate.find("from Employee u where u.name = ?", name);
	}

	public void saveEmployee(Employee emp) {
		hibernateTemplate.save(emp);
	}
	
	
	public List findByUID(Integer id)
	{
	    List list=  hibernateTemplate.find("from Employee where id=?", id);
	      System.out.println("done");
		return list;
		
	}

	public Employee getUpdate(Employee emp) {
		hibernateTemplate.update(emp);
		return emp;
	}

	public Employee getDelete(Employee employee) {
		hibernateTemplate.delete(employee);
		return employee;
	}
	
	
	
	
	
	
	
	
	
	
}
