package kz.singularity.bankAppRepository.model;

import kz.singularity.bankAppRepository.service.AccountCreationService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class BankCore {
    private static long id = 1;
    long lastAccountNumber = 1;

    private AccountCreationService accountCreation;

    @Autowired
    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    void createNewAccount(AccountType accountType, String clientId) {
        accountCreation.create(accountType, id, clientId, String.valueOf(lastAccountNumber));
        this.incrementLastAccountNumber();
    }

    void incrementLastAccountNumber() {
        lastAccountNumber++;
    }


}
