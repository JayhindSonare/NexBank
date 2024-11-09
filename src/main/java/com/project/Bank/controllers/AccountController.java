package com.project.Bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.Bank.entity.Account;
import com.project.Bank.model.DebitCreditModel;
import com.project.Bank.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping("/accountcreate")
	public String AccountCreation() {

		return "accountcreation";
	}

	@RequestMapping(path = "/createform", method = RequestMethod.POST)
	public String createForm(@ModelAttribute Account account, Model model) {

		System.out.println(account);
		boolean res = this.accountService.createAccount(account);

		if (res)
			return "creationSuccessfull"; // make a proper return page

		else
			return "accountcreation";

	}

	@RequestMapping("/accountinfo")
	public String AccountInfo() {

		return "accountinfo";
	}

	@RequestMapping(path = "/fetchform", method = RequestMethod.POST)
	public String fetchForm(@ModelAttribute Account account, Model model) {

		System.out.println(account);
		Account res = this.accountService.fetchAccount(account);

		if (res != null) {

			model.addAttribute("accountName", res.getAccountName());
			model.addAttribute("accountNumber", res.getAccountNumber());
			model.addAttribute("email", res.getEmail());
			model.addAttribute("balance", res.getBalance());
			model.addAttribute("gender", res.getGender());
			model.addAttribute("dateOfBirth", res.getDateOfBirth());

			return "accountinfo";

		} else {

			return "failure";
		}

	}

	@RequestMapping("/debitCredit")
	public String debitCredit() {

		return "debitCredit";
	}

	@RequestMapping(path = "/transactionform", method = RequestMethod.POST)
	public String transactionForm(@ModelAttribute DebitCreditModel debitCreditModel, Model model) {

		System.out.println(debitCreditModel);
		Account res = this.accountService.transactionAccount(debitCreditModel);

		if (res != null) {

			model.addAttribute("accountName", res.getAccountName());
			model.addAttribute("accountNumber", res.getAccountNumber());
			model.addAttribute("email", res.getEmail());
			model.addAttribute("balance", res.getBalance());
			model.addAttribute("gender", res.getGender());
			model.addAttribute("dateOfBirth", res.getDateOfBirth());

			return "accountinfo";

		} else {

			return "failure";
		}

	}

}
