/**
 * 
 */
package com.servicenow.propsdemo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.servicenow.LmsConfigInfo;
import com.servicenow.propsdemo.model.Student;
import com.servicenow.propsdemo.services.StudentService;

/**
 * 
 */
@Service
public class StudentServiceImpl implements StudentService{

	//@Value("${lms.banner}")
	//private String lmsBanner;
	
	@Autowired
	private LmsConfigInfo lmsConfigInfo;
	
	@Override
	public List<Student> showStudents() {
		List<Student> students = new ArrayList<>();
		Student st1 = new Student();
		st1.setRollNo(1001);
		st1.setName("Kiran");
		st1.setCourse("Microservices");
		st1.setFee(1000.00);
		students.add(st1);

		Student st2 = new Student();
		st2.setRollNo(1002);
		st2.setName("Pavan");
		st2.setCourse("Microservices");
		st2.setFee(1200.00);
		students.add(st2);
		
		return students;
	}

	@Override
	public String showBanner() {
		return "From Service :: "+lmsConfigInfo.getBanner();
	}

	@Override
	public String showBannerAndLimits() {
		String password = lmsConfigInfo.getPassword();
		
		return "From Service :: " + lmsConfigInfo.getBanner() + 
				"Min Limit :: " + lmsConfigInfo.getMinLimit() +
				"Max Limit :: " + lmsConfigInfo.getMaxLimit();
	}

}
