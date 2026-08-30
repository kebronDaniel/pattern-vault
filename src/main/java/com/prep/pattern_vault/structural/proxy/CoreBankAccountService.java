package com.prep.pattern_vault.structural.proxy;

import com.prep.pattern_vault.structural.proxy.dto.BankAccount;
import com.prep.pattern_vault.structural.proxy.dto.User;

import java.math.BigDecimal;

public class CoreBankAccountService implements BankAccountService {

    private final BankAccountRepository accountRepository;

    public CoreBankAccountService(BankAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public BankAccount getAccount(String accountId, User requester) {
        BankAccount account = accountRepository.findById(accountId);
        return new BankAccount(account.accountId(), account.ownerId(),account.balance());
    }

    @Override
    public BankAccount deposit(String accountId, BigDecimal amount, User requester) {
        BankAccount account = accountRepository.findById(accountId);
        var newAmount = amount.add(account.balance());
        return accountRepository.save(new BankAccount(accountId,account.ownerId(),newAmount));
    }

    @Override
    public BankAccount withdraw(String accountId, BigDecimal amount, User requester) {
        BankAccount account = accountRepository.findById(accountId);
        if (amount.compareTo(account.balance()) > -1){
            throw new IllegalStateException("Can not withdraw such amount");
        }
        var newBalance = account.balance().subtract(amount);
        account = accountRepository.save(new BankAccount(accountId,account.ownerId(),newBalance));
        return account;
    }
}
