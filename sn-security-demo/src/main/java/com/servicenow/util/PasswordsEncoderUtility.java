/**
 * 
 */
package com.servicenow.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * 
 */
public class PasswordsEncoderUtility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String password = "Pass@hjg";
		String encodedPwd = NoOpPasswordEncoder.getInstance().encode(password);
		System.out.println(encodedPwd);		
		
		encodedPwd = new BCryptPasswordEncoder().encode(password);
		System.out.println(encodedPwd);	
		
		System.out.println(new BCryptPasswordEncoder().matches("Pass@hj", encodedPwd));	

		/*
		 * encodedPwd = new Pbkdf2PasswordEncoder(password, 0, 0, 0).encode(password);
		 * System.out.println(encodedPwd);
		 */
				
		/*
		 * encodedPwd = new StandardPasswordEncoder().encode(password);
		 * System.out.println(encodedPwd);
		 */	
			
		encodedPwd = new BCryptPasswordEncoder().encode("abcd");
		System.out.println("abcd : " + encodedPwd);	
		
		encodedPwd = new BCryptPasswordEncoder().encode("ab12");
		System.out.println("ab12 : " + encodedPwd);	
				
				
				
	}

}
