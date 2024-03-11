package kz.singularity.bankAppRepository.repository;

import kz.singularity.bankAppRepository.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, String> {

}
