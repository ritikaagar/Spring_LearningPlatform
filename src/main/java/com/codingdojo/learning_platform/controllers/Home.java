package com.codingdojo.learning_platform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/m/{chapter}/0553/{lessonNumber}")
	public String first(Model model, @PathVariable("chapter") String discard, @PathVariable("lessonNumber") String lessonNumber) {
		if (lessonNumber.equals("0733")) {
			model.addAttribute("str", "Setting up your servers");
		}
		if (lessonNumber.equals("0342")) {
			model.addAttribute("str","Punch Cards");
		}
		if (lessonNumber.equals("0348")) {
			model.addAttribute("str","Advanced Fortran Intro");
		}
		return "pageone.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String second(Model model, @PathVariable("chapter") String discard, @PathVariable("assignmentNumber") String assignmentNumber) {
		if (assignmentNumber.equals("0345")) {
			model.addAttribute("str","Coding Forums");
		}
		if (assignmentNumber.equals("2342")) {
			model.addAttribute("str","Fortran to binary");
		}
		
		return "pagetwo.jsp";
	}
}
