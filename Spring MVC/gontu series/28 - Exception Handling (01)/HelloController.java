package com.neeraj.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class,"studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAddmissionForm() throws Exception{
		
		//String exceptionOccured = "NULL_POINTER";
		//String exceptionOccured = "IO_EXCEPTION";
		String exceptionOccured = "ARITHMETHIC_EXCEPTION";
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		}else if(exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("exception");
		}else if(exceptionOccured.equalsIgnoreCase("ARITHMETHIC_EXCEPTION")) {
			throw new ArithmeticException("Arithmetic Exception");
		}
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
		model1.addAttribute("headerMessage","Neeraj College of Enginerring, India");
	}
	
	
	@RequestMapping(value= "/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView helloWorld(@Valid @ModelAttribute("student1") Student student1,BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		return model;
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		
		//logging Null Pointer Exception
		System.out.println("Null Pointer Exception Occured: "+e);
		
		return "NullPointerException";
	}
	
	@ExceptionHandler(value= IOException.class)
	public String handleIOException(Exception e) {
		//logging IO Pointer Exception
		System.out.println("IO Exception Occured: "+e);
		return "IOException";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		
		//logging Generic Exception
		System.out.println("Unknown Exception Occured: "+e);
		return "Exception";
	}
	
}
