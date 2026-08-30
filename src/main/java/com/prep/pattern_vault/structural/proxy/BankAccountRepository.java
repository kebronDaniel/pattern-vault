package com.prep.pattern_vault.structural.proxy;

import com.prep.pattern_vault.structural.proxy.dto.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepository {

    private final Map<String, BankAccount> accounts = new HashMap<>();

    public BankAccount findById(String accountId) {
        BankAccount account = accounts.get(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Account not found: " + accountId);
        }
        return account;
    }

    public BankAccount save(BankAccount account) {accounts.put(account.accountId(), account);
        return account;
    }
}