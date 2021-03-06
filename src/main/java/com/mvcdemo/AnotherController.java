package com.mvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("springform")
public class AnotherController {
	
	@RequestMapping("/springform/")
	public String showDummy(){
		return "main-menu-spring";
	}
	
	@RequestMapping("/ShowForm")
	public String ShowForm(Model theModel) {
		//Create student object
		Student theStudent = new Student();
		//add student object to model
		theModel.addAttribute("student", theStudent);
		return "home-form-spring";
	}
	
	@RequestMapping("/ProcessForm")
	public String ProcessForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult,Model model) {
		if(theBindingResult.hasErrors()) {
			return "home-form-spring";
		}else {
			String theName = theStudent.getStudentName();
			theName = theName.toLowerCase();
			String salutation;
			String result;
			char Gender = theStudent.getStudentGender();
			if(Gender=='M') {
				salutation="Mr.";
				result = "Yo " + salutation+theName + "!";
			}else if(Gender=='F') {
				salutation="Miss ";
				result = "Yo " + salutation+theName + "!";
			}else {
				result = "Yo " + theName + "!";
			}
			model.addAttribute("message", result);
			return "submitted-spring";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

}
