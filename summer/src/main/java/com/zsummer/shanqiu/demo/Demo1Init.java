package com.zsummer.shanqiu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoInit")
public class Demo1Init {

	@RequestMapping("/sayHello")
	public Object sayHello() {
		return "hello";
	}
}