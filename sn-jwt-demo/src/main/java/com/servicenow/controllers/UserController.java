/**
 * 
 */
package com.servicenow.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
@RequestMapping("/auth")
public class UserController {

	
	@GetMapping("/welcome")
	public ResponseEntity<String> showWelcomeMessage() {
		return new ResponseEntity<String>("Welcome User", HttpStatus.OK);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<String> customerHome(){
		return new ResponseEntity<String>("Welcome Customer", HttpStatus.OK);
	}
	
	@GetMapping("/seller")
	public ResponseEntity<String> sellerHome(){
		return new ResponseEntity<String>("Welcome Seller", HttpStatus.OK);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminHome(){
		return new ResponseEntity<String>("Welcome Admin", HttpStatus.OK);
	}
	
	
	
	
}
