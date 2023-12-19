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
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/show")
	public String showAdminHome() {
		return "Welcome Admin";
	}
	
	@GetMapping("/menu")
	public String showStudentOperations() {
		return "This is student menu";
	}
}
