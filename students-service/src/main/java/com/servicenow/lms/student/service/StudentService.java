/**
 * 
 */
package com.servicenow.lms.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.servicenow.lms.student.entity.Student;

/**
 * 
 */

public interface StudentService {
	
	public List<Student> fetchStudentsList();
	public String createStudent(Student student); 
	public Student modifyStudent(Student student, Long rollNo);
	public String removeStudent(Long rollNo);
	
}
