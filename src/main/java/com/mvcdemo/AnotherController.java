package com.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String ProcessForm(@ModelAttribute("student") Student theStudent, Model model) {
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
