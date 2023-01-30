package com.project.finance.finance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;

	public Account createAccount() {
		Account account = new Account (001, "sarthak", "savings", "mh-20", 24343);
		return account;
	}

	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	public Account viewPolicy(int accountNumber) {
		// TODO Auto-generated method stub
		return accountRepository.findById(accountNumber).get();
	}


	public Account CreateAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	public void deletePolicy(int accountNumber) {
		
		accountRepository.deleteById(accountNumber);
	}

	public List<Account> viewAll() {
		List<Account> accounts = new ArrayList<Account>();
	      accountRepository.findAll().forEach(account -> accounts.add(account));
	      return accounts;
	}

}