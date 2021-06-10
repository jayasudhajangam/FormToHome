package com.sssrikanth.formtohome.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String home() {
		return "Welcome to Form to Home";
	}
}
