package com.yy.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestCtrl {

	@RequestMapping(value = "/test1")
	public @ResponseBody String test1() {
		
		return "Hello World";
	}
	
	@RequestMapping(value = "/test2/{name}")
	public @ResponseBody String test2(
			@PathVariable("name") String name) {
		
		return "Hello, " + name + ".";
	}
	
}
