package com.task.spring1example.helloworlddemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldmain {
	@RequestMapping("/hello")
	public String test() {
		return "HELLO WORLD";
		
	}

}
