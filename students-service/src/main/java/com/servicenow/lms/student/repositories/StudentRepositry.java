/**
 * 
 */
package com.servicenow.lms.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicenow.lms.student.entity.Student;

/**
 * 
 */
public interface StudentRepositry extends JpaRepository<Student, Long> {

}
