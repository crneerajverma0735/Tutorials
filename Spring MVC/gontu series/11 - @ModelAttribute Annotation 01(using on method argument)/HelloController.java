package com.neeraj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAddmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	/*
	@RequestMapping(value= "/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView helloWorld(@RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby) {
		
		Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMessage","Neeraj college of india");
		model.addObject("student1",student1);
		return model;
	}
	*/
	
	@RequestMapping(value= "/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView helloWorld(@ModelAttribute("student1") Student student1) {
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMessage","Neeraj college of india");
		
		return model;
	}
	
	
	
	
}
