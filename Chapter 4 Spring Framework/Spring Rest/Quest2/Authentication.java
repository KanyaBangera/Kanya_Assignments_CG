package com.example.demo.Que2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Authentication {
	
	public static final String userid="amruta";
	public static final String password="amruta123";
	
	@RequestMapping("/verify/{user}/{pass}")
	public String authenticate(@PathVariable(name="user") String user, @PathVariable(name="pass") String pass) {
		if(user.endsWith(userid)&& pass.endsWith(password)) {
			return "Valid User";		
	}
	else {
		return "Invalid User";
	}
}
}
