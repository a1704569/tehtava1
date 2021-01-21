package com.example.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping ("/hello")
	public String hello
		(@RequestParam (value= "name") String name
		, @RequestParam (value= "location") String location
		, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", name);
		return "Welcome to the " +location+ " " + name ;
	}

}
