/**
 * 
 */
package com.anil.primary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anil.primary.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class PrimaryServiceController {

	private GreetingService greetingService;

	@Autowired
	public PrimaryServiceController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayGreeting();
	}

}
