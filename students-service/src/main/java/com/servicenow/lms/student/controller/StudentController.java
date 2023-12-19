/**
 * 
 */
package com.servicenow.lms.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicenow.lms.student.entity.Student;
import com.servicenow.lms.student.service.StudentService;

/**
 * 
 */
@RestController
@RequestMapping("/v1/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<Student> fetchStudentsList() {
		return studentService.fetchStudentsList();
	}
	
	@PostMapping
	public String createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@PutMapping("/{rollNo}")
	public Student modifyStudent(@RequestBody Student student, @PathVariable Long rollNo) {
		return studentService.modifyStudent(student, rollNo);
	}
	
	@DeleteMapping("/{rollNo}")
	public String removeStudent(@PathVariable Long rollNo) {
		return studentService.removeStudent(rollNo);
	}
	
}
