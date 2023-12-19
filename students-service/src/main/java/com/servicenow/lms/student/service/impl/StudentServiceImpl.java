/**
 * 
 */
package com.servicenow.lms.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicenow.lms.student.entity.Student;
import com.servicenow.lms.student.repositories.StudentRepositry;
import com.servicenow.lms.student.service.StudentService;

/**
 * 
 */
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepositry studentRepository;
	
	List<Student> studentsList;
	
	public StudentServiceImpl() {
		studentsList = new ArrayList<Student>();
	}

	@Override
	public List<Student> fetchStudentsList() {
		return studentRepository.findAll();
	}

	@Override
	public String createStudent(Student student) {
		Student st = studentRepository.save(student);
		return "Student Created";
	}

	@Override
	public Student modifyStudent(Student student, Long rollNo) {
		return student;
	}

	@Override
	public String removeStudent(Long rollNo) {
		return "Student Removed";
	}

	/**
	 * @return the studentsList
	 */
	public List<Student> getStudentsList() {
		return studentsList;
	}

	/**
	 * @param studentsList the studentsList to set
	 */
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

}
