package com.douzone.ch08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ApiTestController {

	
	@RequestMapping("/text")
	public String text() {
		return "text";
	}
	
	@RequestMapping("/html")
	public String html() {
		return "html";
	}
	
	@RequestMapping("/json")
	public String json() {
		return "json";
	}
}
