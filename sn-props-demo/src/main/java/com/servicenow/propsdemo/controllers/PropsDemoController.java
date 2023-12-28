/**
 * 
 */
package com.servicenow.propsdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicenow.propsdemo.model.Student;
import com.servicenow.propsdemo.services.StudentService;

/**
 * 
 */
@RestController
@RequestMapping("/api/v1/students")
public class PropsDemoController {

	@Autowired
	private StudentService studentService;
	
	//private String lmsBanner = "LMS Banner";

	@Value("${lms.banner:Dummy Banner}")
	private String lmsBanner;
	
	@GetMapping("/all")
	public List<Student> showStudents() {
		return studentService.showStudents();
	}
	
	@GetMapping("/banner")
	public String showBanner() {
		//return lmsBanner;
		return studentService.showBanner();
	}
	
	@GetMapping("/limits")
	public String showBannerAndLimits() {
		return studentService.showBannerAndLimits();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
