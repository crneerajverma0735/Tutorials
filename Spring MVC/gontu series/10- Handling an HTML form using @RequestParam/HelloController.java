package com.neeraj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public ModelAndView helloWorld(@RequestParam(value="studentName", defaultValue="Mr. ABCXYZ") String name, @RequestParam("studentHobby") String hobby) {
		
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted by you:: Name: "+name+", Hobby: "+hobby );
		return model;
	}
	*/
	
	@RequestMapping(value= "/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView helloWorld(@RequestParam Map<String,String> reqPar) {
		String name = reqPar.get("studentName");
		String hobby = reqPar.get("studentHobby");
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted by you:: Name: "+name+", Hobby: "+hobby );
		return model;
	}
	
	
}
