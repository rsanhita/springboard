package com.samtech.shoprest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.model.User;
import com.samtech.shoprest.repository.AccountRepository;
import com.samtech.shoprest.repository.UserRepository;
import com.samtech.shoprest.service.AcctMgmtService;
import com.samtech.shoprest.service.UserMngtService;

@Controller
public class UserController {

	// TODO excellent example of final
	private final UserMngtService userMgmtService;

	private final AcctMgmtService acctMgmtService;

	private final AccountRepository accountRepository;

	// TODO - Through Autowire we are creating objects
	@Autowired
	public UserController(UserMngtService userMgmtService, AccountRepository accountRepository,
			AcctMgmtService acctMgmtService) {

		System.out.println("****************************");
		System.out.println("INSIDE CONSTRUCTOR FOR User Controller.");
		System.out.println("****************************");

		this.userMgmtService = userMgmtService;
		this.acctMgmtService = acctMgmtService;
		this.accountRepository = accountRepository;

	}

	@GetMapping("/index")
	public String showUserList(Model model) {

		System.out.println("***  Inside showUserList()....*");

		// get the list of users from DB
		Iterable<User> users = userMgmtService.retrieveUserList();

		// set the list of users in Model
		model.addAttribute("users", users);
		

		// redirect to the intended page
		return "index";
	}

	@GetMapping("/signup")
	public String showSignUpForm(User user) {
		System.out.println("***  Inside showSignUpForm()....*");
		return "add-user";
	}

	@GetMapping("/signup1")
	public String showSignUpForm1(Account account) {

		return "add-acct";
	}

	@PostMapping("/adduser")
	public String addUser(@Validated User user, BindingResult result, Model model) {

		System.out.println("***  Inside addUser()....*");
		if (result.hasErrors()) {
			return "add-user";
		}

		User savedUser = userMgmtService.addUser(user);

		// userRepository.save(user);
		return "redirect:/index";
	}

	@PostMapping("/addacct")
	public String addAcct(@Validated Account account, BindingResult result, Model model) {

		System.out.println("***  Inside add Acct()....*");

		if (result.hasErrors()) {
			return "add-acct";
		}

		Account savedAccount = accountRepository.save(account);

		System.out.println("Redirectring..########..");
		// userRepository.save(user);
		return "redirect:/accts";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {

		// User user = userRepository.findById(id).orElseThrow(() -> new
		// IllegalArgumentException("Invalid user Id:" + id));

		// retrieve the user from DB if it exists
		Optional<User> user = userMgmtService.findUserByID(id);
		if (user.isEmpty()) {
			throw new IllegalArgumentException("Invalid user Id:" + id);
		}

		// set the user in the model
		model.addAttribute("user", user);

		return "update-user";
	}

	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Validated User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			// user.setId(id);
			return "update-user";
		}

		userMgmtService.addUser(user);

		return "redirect:/index";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		// User user = userRepository.findById(id).orElseThrow(() -> new
		// IllegalArgumentException("Invalid user Id:" + id));
		// retrieve the user from DB if it exists

		Optional<User> user = userMgmtService.findUserByID(id);
		if (user.isEmpty()) {
			throw new IllegalArgumentException("Invalid user Id:" + id);
		} else {

			// userRepository.delete(user);
			userMgmtService.deleteUser(user.get());
		}

		return "redirect:/index";
	}

	////////////// ACCTS realted mappings /////////////////////////

	@GetMapping("/accts")
	public String showAccounts(Model model) {

		System.out.println("***  Inside showAccount()....*");

		//todo - change the call to repository
		Iterable<Account> accounts = accountRepository.findAll();

		// set the list of users in Model
		model.addAttribute("accounts", accounts);

		// redirect to the intended page
		return "accts";
	}

	@GetMapping("/acct/{id}")
	public String showAccountsList(@PathVariable("id") long id, Model model) {

		System.out.println("***  Inside showAccountsList()....id =*" +id);

		Iterable<Account> accounts = acctMgmtService.retriveAccountById(id);

		// set the list of users in Model
		// model.addAttribute("account", accounts);
		model.addAttribute("accounts", accounts);

		// redirect to the intended page
		return "accts";
	}
	
	@GetMapping("/exp/accts")
	public String doExperiemnts(Model model) {

		System.out.println("***  Inside doExperiemnts()....*");

		//todo - change the call to repository
		//Iterable<Account> accounts = accountRepository.;

		// set the list of users in Model
		//model.addAttribute("accounts", accounts);

		// redirect to the intended page
		return "accts";
	}
}
