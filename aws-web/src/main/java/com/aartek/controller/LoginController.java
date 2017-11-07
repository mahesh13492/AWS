package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserDTO;
import com.aartek.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		
		System.out.println("Inside Login Controller");
		UserDTO user = new UserDTO();
		map.put("userDTO", user);
		return "login";
	}
	
	@RequestMapping(value="/submitLogin", method = RequestMethod.POST)
	public String submitLogin(@ModelAttribute(value = "userDTO") UserDTO user) {
		System.out.println("Inside Login Submit Controller");
		System.out.println(user.getEmail());;
		System.out.println(user.getPassword());
		System.out.println("======================");
		
		loginService.submitLoginService(user);
		
		return "login";
	}
}
