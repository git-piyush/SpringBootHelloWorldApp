package com.spring.MySpringboot.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!! The current Date and time is "+LocalDateTime.now();
	}
	
	@GetMapping("/name")
	public String name() {
		//return "Trying to see how pull request works";
		return "Testing commit from git1";
	}
}
