package com.chandra.springboot.SpringBoot_01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Boot Applications";
	}
	
	@RequestMapping("/hello")
	public String greet() {
		return "Hello Spring Boot";
	}

}
