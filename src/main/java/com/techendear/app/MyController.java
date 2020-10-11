package com.techendear.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String mainPage() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "Welcome Admin";
	}
}
