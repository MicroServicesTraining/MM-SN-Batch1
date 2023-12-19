/**
 * 
 */
package com.servicenow.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@GetMapping("/show")
	public String showAdminHome() {
		return "Welcome Teacher";
	}
	
	@GetMapping("/menu")
	@PreAuthorize("hasAnyRole('ROLE_TEACHER', 'ROLE_STUDENT')")
	public String showTeacherOperations() {
		return "This is teacher menu";
	}
}
