package com.project.finance.finance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class FinanceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testcreateAccount() {
		Account account = new Account(001, "sarthak", "savings", "mh-20", 24343);
		AccountService aService=new AccountService();
		assertEquals(account.getAccountNumber(),aService.createAccount().getAccountNumber());
	}
	
	@Autowired
	AccountRepository accountRepository;
	
	
	@Test
	void testViewAccount() {
		List<Account> account = accountRepository.findAll();
		assertThat(account.size()).isEqualTo(0);
	}
	
	

}
