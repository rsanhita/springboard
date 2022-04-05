package com.samtech.shoprest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samtech.shoprest.model.Account;
import com.samtech.shoprest.repository.AccountRepository;

@Component
/*public class AcctMgmtService {
	
	private final AccountRepository  accountRepository;
	@Autowired
	public AcctMgmtService( AccountRepository  accountRepository ) {
		
		this.accountRepository = accountRepository;
	}*/
	
public class AcctMgmtService{
	
	  private final  AccountRepository accountRepository ;
	  @ Autowired
	  public AcctMgmtService ( AccountRepository accountRepository) {
	
	  this.accountRepository = accountRepository;

	}

	public void createAccount( Account account) {
		
		// this method is not ready yet 
		
		
	}
	
	//TODO - METHOD TO BE CORRECTED LATER
	public Iterable<Account> retriveAccountById ( Long id ) {
		
		
		System.out.println("Input received :"+id);
		
		Optional<Account> account = accountRepository.findById(id);
		
		if (account.isEmpty()) {
			//throw new Exception (" No account with id :: "+id);
		} 
		
		Account account1 = account.get();
		
	
		
		  List<Account> accts = new ArrayList<Account>(); 
		  accts.add(account1); 
		  
		  return accts;
		 
		
		//return Collections.singletonList(account1);
		
	}

	
	public Optional<Account> retriveAccounts ( Long id ) {
		
		
		System.out.println("Input received :"+id);
		
		Optional<Account> acct = accountRepository.findById(id);
		
				
		return acct;
	}
	
}
