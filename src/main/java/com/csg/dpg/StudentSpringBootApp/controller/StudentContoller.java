package com.csg.dpg.StudentSpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
	@GetMapping(value="/welcome")
	public String hello() {
		return "Hello Student..! Welcome..!";
	}
	@GetMapping(value="/home")
	public String home() {
		return "Hello Student..!, This is the Home Page";
	}
	@GetMapping(value="/account")
	public String account() {
		return "Hello Student..!, Set Up your Account with Postman";
	}
	
}
