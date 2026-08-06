package com.prep.pattern_valut;


import com.prep.pattern_valut.structural.proxy.*;
import com.prep.pattern_valut.structural.proxy.dto.BankAccount;
import com.prep.pattern_valut.structural.proxy.dto.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		BankAccountRepository accountRepository = new BankAccountRepository();
		accountRepository.save(new BankAccount("account-1", "user-1", new BigDecimal("100.00")));
		BankAccountService bankAccountService = new SecuredBankAccountService(
				accountRepository, new CoreBankAccountService(accountRepository));
		User user = new User("user=1", Role.SUPPORT);
		var result = bankAccountService.getAccount("account-1",user);
		System.out.println(result.balance());
	}

}
