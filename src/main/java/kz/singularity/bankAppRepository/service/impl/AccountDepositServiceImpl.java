package kz.singularity.bankAppRepository.service.impl;

import kz.singularity.bankAppRepository.model.Account;
import kz.singularity.bankAppRepository.repository.AccountRepository;
import kz.singularity.bankAppRepository.service.AccountDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountDepositServiceImpl implements AccountDepositService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountDepositServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void deposit(double amount, Account account) {
        double balanceAfterDeposit = account.getBalance() + amount;
        account.setBalance(balanceAfterDeposit);
        accountRepository.save(account);
    }
}
