/**
 * 
 */
package com.servicenow.oauth2.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */

@RestController
public class DemoController {

	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Welcome User";
	}
	
	@GetMapping("/userhome")
	public String userHome(Principal principal) {
		return "User Home Page" + principal.getName();
	}
	
}
