package com.dnu.jenkinspipelinesample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@GetMapping
	public String  getServiceInfo() {
		return "Jenkins Pipeline Project";
	}
}
