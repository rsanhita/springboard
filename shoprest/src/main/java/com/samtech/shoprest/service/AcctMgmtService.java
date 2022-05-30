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

		Optional<Account> account = accountRepository.findById(id);

		List<Account> acctlist = new ArrayList<Account>();

		if (account.isEmpty()) {
			// throw new Exception (" No account with id :: "+id);
		}
		// Account account1 = account.get();
		// acctlist.add(account1);
		acctlist.add(account.get());

		return acctlist;
		// return Collections.singletonList(account1);
	}

	public Optional<Account> retriveAccounts(Long id) {

		System.out.println("Input received :" + id);

		Optional<Account> acct = accountRepository.findById(id);

		return acct;
	}

	public List<Account> findAllNonBlankAccts() {

		Iterable<Account> accounts = accountRepository.findAll();

		List<Account> acctlist = new ArrayList<Account>();

		for (Account account : accounts) {

			if (StringUtils.isNotBlank(account.getAcctName()) && StringUtils.isNotBlank(account.getAcctNumber())) {

			}
			acctlist.add(account);

		}

		return acctlist;

	}

	public Account saveAccount(Account account) {

		Account savedAccount = accountRepository.save(account);

		return savedAccount;

	}

	public Iterable<Account> findByAcctNameandNumber(String acctName, List<String> acctNumbers) {

		Iterable<Account> acctlist = accountRepository.findByAcctNameAndAcctNumberIn(acctName, acctNumbers);

		return acctlist;
	}
}
