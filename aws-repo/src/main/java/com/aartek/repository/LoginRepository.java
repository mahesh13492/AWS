package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserDTO;

@Repository
public class LoginRepository {
	
	@Autowired
	HibernateTemplate template;
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	public List findLogin(UserDTO user) {

		System.out.println("-----INSIDE LOGIN Repository-----");
		String email = user.getEmail();
		String password = user.getPassword();

		List list = hibernateTemplate.find("from UserDTO u where u.email = ? and u.password = ?", email, password);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			UserDTO u = (UserDTO) it.next();
			System.out.println("Find Email :: " + u.getEmail());
			System.out.println("Find Password :: " + u.getPassword());
		}
		
		return list;	
	}

}
