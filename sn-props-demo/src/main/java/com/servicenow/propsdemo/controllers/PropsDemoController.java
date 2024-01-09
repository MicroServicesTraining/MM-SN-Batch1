/**
 * 
 */
package com.servicenow.propsdemo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	public static final Logger LOGGER = LoggerFactory.getLogger(PropsDemoController.class);

	@Autowired
	private StudentService studentService;
	
	//private String lmsBanner = "LMS Banner";

	@Value("${lms.banner:Dummy Banner}")
	private String lmsBanner;
	
	@GetMapping("/all")
	public List<Student> showStudents() {
		
		LOGGER.trace("Trace level log");
		LOGGER.debug("Debug level log");
		LOGGER.info("Info level log");
		LOGGER.warn("Warn level log");
		LOGGER.error("Error level log");
		
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
