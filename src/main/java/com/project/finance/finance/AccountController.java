package com.project.finance.finance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello From Banking & Finance LTD. By 'Sarthak'";
	}
	
	@GetMapping("/createAccount")
	public Account createAccount() {
		return accountService.createAccount();
	}
	
	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account) {
		return accountService.CreateAccount(account);
	}
	
	@PutMapping("/updateAccount/{accountNumber}")
	public Account updateAccount(@RequestBody Account account ) {
		return accountService.updateAccount(account);
	}
	
	@GetMapping("/viewPolicy/{accountNumber}")
	public Account viewPolicy(@PathVariable("accountNumber")int accountNumber) {
		return accountService.viewPolicy(accountNumber);
	}
	@DeleteMapping("/deletePolicy/{accountNumber}")
	public void deletePolicy(@PathVariable("accountNumber")int accountNumber) {
		accountService.deletePolicy(accountNumber);
	}
	@GetMapping("/viewAll")
	public List<Account> viewAll() {
		return accountService.viewAll();
	}
}