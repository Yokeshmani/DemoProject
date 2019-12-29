
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping("/home")
	public String display() {
		return "Hi Yokesh this is from jira branch 23456";
	}
}
