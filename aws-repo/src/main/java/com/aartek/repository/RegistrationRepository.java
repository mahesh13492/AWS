package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserDTO;

@Repository
public class RegistrationRepository {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void findRegistration(UserDTO user) {

		System.out.println("Inside Registration Repository");

		hibernateTemplate.save(user);

	}
	
}
