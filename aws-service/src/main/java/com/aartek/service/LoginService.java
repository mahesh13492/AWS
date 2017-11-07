package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserDTO;
import com.aartek.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public void submitLoginService(UserDTO user) {
		System.out.println("Inside submitLogin Service");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println("==========================");
		loginRepository.findLogin(user);
	}

}
