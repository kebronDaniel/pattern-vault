package com.prep.pattern_valut.structural.proxy;

import com.prep.pattern_valut.structural.proxy.dto.BankAccount;
import com.prep.pattern_valut.structural.proxy.dto.User;

import java.math.BigDecimal;

public class SecuredBankAccountService implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountService bankAccountService;

    public SecuredBankAccountService(BankAccountRepository bankAccountRepository, BankAccountService bankAccountService) {
        this.bankAccountRepository = bankAccountRepository;
        this.bankAccountService = bankAccountService;
    }

    @Override
    public BankAccount getAccount(String accountId, User requester) {
        BankAccount account = bankAccountRepository.findById(accountId);
        System.out.printf("Verifying the account number - %s \n", account.accountId());
        if (requester.role().equals(Role.SUPPORT)) throw new AccessDeniedException(requester.id());
        return bankAccountService.getAccount(accountId,requester);
    }

    @Override
    public BankAccount deposit(String accountId, BigDecimal amount, User requester) {
        BankAccount account = bankAccountRepository.findById(accountId);
        System.out.printf("Verify privileges of owner-id - %s \n", account.ownerId());
        if (requester.role().equals(Role.SUPPORT)) throw new AccessDeniedException(requester.id());
        return bankAccountService.deposit(accountId,amount,requester);
    }

    @Override
    public BankAccount withdraw(String accountId, BigDecimal amount, User requester) {
        BankAccount account = bankAccountRepository.findById(accountId);
        System.out.printf("Verify the owner of id - %s",account.ownerId());
        if (requester.role().equals(Role.SUPPORT)) throw new AccessDeniedException(requester.id());
        return bankAccountService.withdraw(accountId,amount,requester);
    }
}
