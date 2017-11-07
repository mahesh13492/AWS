package com.aartek.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserDTO;
import com.aartek.service.RegistrationService;


@Controller
public class RegistrationController {
	
	@Autowired(required=true)
	private RegistrationService registrationService;
	

	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String registration(Map<String, Object>map, UserDTO user)
	{
		System.out.println("Inside Rgistration controller");
		
		   map.put("Registration",user );	
		   System.out.println(user.getFirstName());
		   
			return "registration";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public String registrationSubmit(@ModelAttribute(value="Registration")UserDTO user){
		
		
		registrationService.userRegistrationService(user);
		return "redirect:/login.do";
	}

}

