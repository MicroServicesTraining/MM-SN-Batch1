/**
 * 
 */
package com.servicenow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping
public class HomeController {

	@GetMapping("/welcome")
	public String showWelcome() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String showAdminHome() {
		return "Welcome Admin";
	}
	
	@GetMapping("/student")
	public String showStudentHome() {
		return "Welcome Student";
	}
	
	@GetMapping("/teacher")
	public String showTeacherHome() {
		return "Welcome Teacher";
	}
	
}
