package kz.singularity.bankAppRepository.service;

import kz.singularity.bankAppRepository.model.Account;
import kz.singularity.bankAppRepository.model.AccountType;
import kz.singularity.bankAppRepository.model.AccountWithdraw;

import java.util.List;

public interface AccountListingService {
    Account getClientAccount(String clientId, String accountId);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    List<Account> getClientAccounts(String clientId);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);

}
