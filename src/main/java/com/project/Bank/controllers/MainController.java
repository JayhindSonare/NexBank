package com.project.Bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.Bank.entity.Teller;
import com.project.Bank.service.TellerService;

@Controller
public class MainController {

	@Autowired
	private TellerService tellerService;

	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}

	@RequestMapping("/register")
	public String registrationForm() {
		return "register";
	}

	@RequestMapping(path = "/authform", method = RequestMethod.POST)
	public String authForm(@ModelAttribute Teller teller, Model model) {

		System.out.println(teller);
		Boolean res = this.tellerService.findId(teller);

		if (res)
			return "dashboard";

		else {
			return "login";
		}

	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute Teller teller, Model model) {

		System.out.println(teller);
		boolean res = this.tellerService.createTeller(teller);

		if (res)
			return "success";

		else
			return "register";

	}

}
