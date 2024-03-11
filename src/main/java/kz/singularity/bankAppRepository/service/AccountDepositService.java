package kz.singularity.bankAppRepository.service;

import kz.singularity.bankAppRepository.model.Account;

public interface AccountDepositService {
    void deposit(double amount, Account account);
}
