package com.prep.pattern_valut.structural.proxy;

import com.prep.pattern_valut.structural.proxy.dto.BankAccount;
import com.prep.pattern_valut.structural.proxy.dto.User;

import java.math.BigDecimal;

public interface BankAccountService {
    BankAccount getAccount(String accountId, User requester);
    BankAccount deposit(String accountId, BigDecimal amount,User requester);
    BankAccount withdraw(String accountId,BigDecimal amount,User requester);
}