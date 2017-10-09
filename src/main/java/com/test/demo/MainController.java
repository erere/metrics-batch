package com.test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	private static final String INDEX = "Hello";

	@RequestMapping(value = "/")
	public String index() {
		return INDEX;
	}
}
