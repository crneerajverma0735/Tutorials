package com.neeraj.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAddmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
		model1.addAttribute("headerMessage","Neeraj College of Enginerring, India");
	}
	
	
	@RequestMapping(value= "/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView helloWorld(@ModelAttribute("student1") Student student1,BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("AdmissionForm");
		}
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		return model;
	}
	
	
	
}
