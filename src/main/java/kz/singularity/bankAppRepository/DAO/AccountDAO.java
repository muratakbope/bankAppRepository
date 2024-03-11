package kz.singularity.bankAppRepository.DAO;

import kz.singularity.bankAppRepository.model.Account;
import kz.singularity.bankAppRepository.model.AccountType;
import kz.singularity.bankAppRepository.model.AccountWithdraw;


import java.util.List;


public interface AccountDAO  {
    List<Account> getClientAccounts(String clientId);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientId, Long accountId);
    Account getClientAccount(String clientId, Long accountId);



}
