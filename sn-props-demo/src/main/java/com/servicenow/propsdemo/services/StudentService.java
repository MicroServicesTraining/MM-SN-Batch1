/**
 * 
 */
package com.servicenow.propsdemo.services;

import java.util.List;

import com.servicenow.propsdemo.model.Student;

/**
 * 
 */
public interface StudentService {
	public List<Student> showStudents();

	public String showBanner();

	public String showBannerAndLimits();
}
