package service;

import java.math.BigDecimal;

import pojo.Checking;
import repository.AccountRepository;

public class CheckingService implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public void deposit(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().add(amount));
        updateAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(amount));
        updateAccount(account);
    }

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Checking account) {
        this.accountRepository.createAccount(account);
    }

    public Checking retrieveAccount(String id) {
        return (Checking)this.accountRepository.retrieveAccount(id);
    }

    public void updateAccount(Checking account) {
        this.updateAccount(account);
    }

    public void deleteAccount(String id) {
        this.deleteAccount(id);
    }
}
