package com.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthenticationControllert {

	@RequestMapping(value = "/test")
	public String test() {

		return "Test Successful and pass is ";
	}
}
