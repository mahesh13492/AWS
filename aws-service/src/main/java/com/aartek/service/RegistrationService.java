package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserDTO;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public void userRegistrationService(UserDTO user){
		System.out.println("-----INSIDE LOGIN SERVICE-----");
		
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getFirstName());
		
		registrationRepository.findRegistration(user);
	}

}
