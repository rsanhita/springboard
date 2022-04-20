package com.samtech.shoprest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.repository.AccountRepository;

@Service
public class AcctMgmtService {

	private final AccountRepository accountRepository;

	@Autowired
	public AcctMgmtService(AccountRepository accountRepository) {

		this.accountRepository = accountRepository;

	}


	public Iterable<Account> retriveAccountById(Long id) {

		System.out.println("Input received :" + id);

		Optional<Account> account = accountRepository.findById(id);

		if (account.isEmpty()) {
			// throw new Exception (" No account with id :: "+id);
		}

		Account account1 = account.get();

		List<Account> accts = new ArrayList<Account>();
		accts.add(account1);

		return accts;

		
		
		// return Collections.singletonList(account1);

	}

	public Optional<Account> retriveAccounts(Long id) {

		System.out.println("Input received :" + id);

		Optional<Account> acct = accountRepository.findById(id);

		return acct;
	}

	public List<Account> findAllNonBlankAccts() {
				
		//get the list from DB
		Iterable<Account> accountsIterable =  accountRepository.findAll();
		
		//Create a place holder for the accountlist to be created
		//programming to an interface
		// we can write this way too Line 73 but Line 75 is better
		//ArrayList<Account> acctsList = new ArrayList<Account>();

		List<Account> acctsList = new ArrayList<Account>();
		

		//foreach loop	
		for(Account account:accountsIterable) {
			
			//add only the records that has valid name and number
			
			if(StringUtils.isNotBlank(account.getAcctName()) && StringUtils.isNotBlank(account.getAcctNumber())) {
				//add to the arraylist to be returned
				acctsList.add(account);
				
				
			}				
		} 
		return acctsList;
	}
	public Account saveAccount( Account account ) {
		
		Account savedAccount = accountRepository.save(account);	
		
		return savedAccount;
		
	}
	
	public Iterable<Account> findByAcctNameandNumber (String acctName,List<String> acctNumbers) {
	
		
		Iterable<Account> acctlist = accountRepository. findByAcctNameAndAcctNumberIn(acctName, acctNumbers);
		
		return acctlist;
	}
}
