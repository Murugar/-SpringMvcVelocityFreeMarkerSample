package com.iqmsoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ftl")
public class TestController {
	
	private static final String message = "Welcome to Spring MVC!";

	@RequestMapping("/home")
	public ModelAndView showMessage() {
		

		ModelAndView mv = new ModelAndView("ftlhelloworld");
		mv.addObject("message", message);
		mv.addObject("name", "home");
		return mv;
	}
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("ftlhelloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}