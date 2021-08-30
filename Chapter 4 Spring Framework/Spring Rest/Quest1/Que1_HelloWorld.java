package com.example.demo.Que1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Que1_HelloWorld {
	
	@RequestMapping(value= "/hello" , method=RequestMethod.GET)
	public String print() {
		return "HELLO WORLD";
	}

}
