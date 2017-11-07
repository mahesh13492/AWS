package com.aartek.controller.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aartek.model.Employee;
import com.aartek.repository.EmployeeRepository;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
//	----------Insert Records here---------------
	@RequestMapping(value = "/employee/save", method = RequestMethod.POST)
	@ResponseBody
	public Employee save(@RequestBody Employee emp) {
		// RegisterDT reg = new RegisterDT();
		employeeRepository.saveEmployee(emp);

		return emp;

	}
	
//-----------------GEt Records By Name ----------------------
	
	@RequestMapping(value = "/employee/{name}", method = RequestMethod.GET)
	public @ResponseBody Employee getEmployees(@PathVariable String name) {
		System.out.println("web services ");
		Employee emp = new Employee();
		emp.setName(name);
		employeeRepository.findName(name);
		
		return emp;

	}
	
//	--------------update Records--------------------------

	@RequestMapping(value = "/employee/update/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public Employee getUpdate(@PathVariable Integer id,@RequestBody Employee employee) {
		Employee emp = new Employee();
		emp.setId(id);
		System.out.println(id);
		List list = employeeRepository.findByUID(id);
		emp.setName(employee.getName());
			
		emp=employeeRepository.getUpdate(emp);
		return emp;
	}
	
	/******************** Delete Records **************************/

	@RequestMapping(value = "/employee/delete/{id}" , method = RequestMethod.DELETE)
	@ResponseBody
	public Employee getData(@PathVariable Integer id) {

		Employee employee = new Employee();
		employee.setId(id);
		employee=employeeRepository.getDelete(employee);
		return employee;
	}

}
