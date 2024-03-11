package kz.singularity.bankAppRepository.service;

import kz.singularity.bankAppRepository.model.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, long bankId,
                String clientId, String accountId);

}
