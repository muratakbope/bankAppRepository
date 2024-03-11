package kz.singularity.bankAppRepository.service;

import kz.singularity.bankAppRepository.model.AccountWithdraw;

public interface AccountWithdrawService {
    void withdraw(double amount, AccountWithdraw accountWithdraw);
}
