package com.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/home/")
	public String ShowPage() {
		return "main-menu";
	}
	
	@RequestMapping("/ShowForm")
	public String ShowForm() {
		return "home-form";
	}
	
	@RequestMapping("/ProcessForm")
	public String ProcessForm(@RequestParam("studentname") String theName,@RequestParam("gender") 
		char Gender,Model model) {
		theName = theName.toLowerCase();
		String salutation;
		String result;
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
		return "submitted";
	}

}
