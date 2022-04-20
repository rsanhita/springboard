package com.samtech.shoprest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.service.AcctMgmtService;

@Controller
public class AccountController {

	private final AcctMgmtService acctMgmtService;

	@Autowired
	public AccountController(AcctMgmtService acctMgmtService) {

		this.acctMgmtService = acctMgmtService;

	}

	@GetMapping("/accts")
	public String showAccounts(Model model) {

		System.out.println("***  Inside showAccount()....***");

		String[] acctNumbers = { "80539765", "98765432", "34568743", "987543" };

		// this is a dummycall
		Iterable<Account> accountlist = acctMgmtService.findByAcctNameandNumber("tuttu", Arrays.asList(acctNumbers));

		// todo - change the call to repository
		// Iterable<Account> accounts = accountRepository.findAll();
		List<Account> accounts = acctMgmtService.findAllNonBlankAccts();

		// set the list of users in Model
		model.addAttribute("accounts", accounts);

		// redirect to the intended page
		return "accts1";
	}
	
	@GetMapping("/acct/{id}")
	public String showAccountsList(@PathVariable("id") String id, Model model) {

		System.out.println("***  Inside showAccountsList()....id =*" +id);
		
		Long.parseLong(id);
		
		Long myL = Long.valueOf(5l);
		
		myL.doubleValue();
		
		myL.longValue();
		
		myL.intValue();
		myL.decode("15");
		
		Integer a = Integer.valueOf(2);
		a = a.intValue() * 10;
		System.out.println(a.intValue()); // will output 20
		
		
		
		Iterable<Account> accounts = acctMgmtService.retriveAccountById(Long.parseLong(id));

		// set the list of users in Model
		// model.addAttribute("account", accounts);
		model.addAttribute("accounts", accounts);

		// redirect to the intended page
		return "accts1";
	}
	
	@GetMapping("/exp/accts")
	public String doExperiemnts(Model model) {

		System.out.println("***  Inside doExperiemnts()....*");

		//todo - change the call to repository
		
		List<Account> accounts = acctMgmtService.findAllNonBlankAccts();
						
		List<Account> result = 
				  StreamSupport.stream(accounts.spliterator(), false)
				    .collect(Collectors.toList());
		
		for ( int i =0; i<result.size(); i++) {
			
				System.out.println("email id :" + result.get(i).getEmail());	
		
		}
		
		for (Account account : accounts) {
			System.out.println("email id :" + account.getEmail());
		}

	
		model.addAttribute("accounts", accounts);

		return "accts1";
	}
	
	//this endpoint will exclude non blank entries
		@GetMapping("/exp/accts/nb")
		// Spring is using this model parameter.
		public String doEshowNonBlank(Model model) {
 
			System.out.println("***  Inside doEshowNonBlank()....*");
			
			/*
			 * //get the list from DB Iterable<Account> accountsIterable =
			 * accountRepository.findAll();
			 * 
			 * //Create a place holder for the accountlist to be created List<Account>
			 * acctsList = new ArrayList<Account>();
			 * 
			 * //foreach loop for(Account account:accountsIterable) {
			 * 
			 * //add only the records that has valid name and number
			 * 
			 * if(StringUtils.isNotBlank(account.getAcctName()) &&
			 * StringUtils.isNotBlank(account.getAcctNumber())) { //add to the arraylist to
			 * be returned acctsList.add(account);
			 * 
			 * 
			 * } }
			 */
			
			//List<Account> acctsList = new ArrayList<Account>();
			
			List<Account> acctsList =	acctMgmtService.findAllNonBlankAccts(); 		 		
			// set the list of users in Model
			model.addAttribute("accounts", acctsList);

			// redirect to the intended page
			return "accts1";
		}
		

		@PostMapping("/addacct")
		public String addAcct(@Validated Account account, BindingResult result, Model model) {

			System.out.println("***  Inside add Acct()....*");

			if (result.hasErrors()) {
				return "add-acct";
			}

			//Account savedAccount = accountRepository.save(account);
			acctMgmtService.saveAccount(account);

			System.out.println("Redirectring..########..");
			// userRepository.save(user);
			return "redirect:/accts";
			//return "home";
		}	
	
	
	@GetMapping("/acct/signup")
	public String showSignUpForm1(Account account) {

		return "add-acct";
	}
	
	
	@GetMapping("/acct/edit/{id}")
	public String editAccount(@PathVariable("id") long id, Model model) {

		// User user = userRepository.findById(id).orElseThrow(() -> new
		// IllegalArgumentException("Invalid user Id:" + id));

		// retrieve the user from DB if it exists
		//Optional<User> user = userMgmtService.findUserByID(id);
		Optional<Account> acct = acctMgmtService.retriveAccounts(id);
		
		if (acct.isEmpty()) {
			throw new IllegalArgumentException("Invalid acct Id:" + id);
		}

		// set the user in the model
		model.addAttribute("account", acct);
		System.out.println("redirecting to ");

		return "update-acct";
	}
	
	@PostMapping("/editacct")
	public String editAcct(@Validated Account account, BindingResult result, Model model) {

		System.out.println("***  Inside edit Acct()....*");

		if (result.hasErrors()) {
			return "add-acct";
		}

		//Account savedAccount = accountRepository.save(account);
		acctMgmtService.saveAccount(account);

		System.out.println("Redirectring..########..");
		// userRepository.save(user);
		return "redirect:/accts";
		//return "home";
	}
	
	
		
	}


