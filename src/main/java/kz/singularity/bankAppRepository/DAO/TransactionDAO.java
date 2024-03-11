package kz.singularity.bankAppRepository.DAO;

import kz.singularity.bankAppRepository.model.Transaction;

import java.util.List;

public interface TransactionDAO {
    List<Transaction> getTransactions();
    void addTransaction(Transaction transaction);
}
