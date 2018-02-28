package com.rvfs.challenge.mybank.repository;

import com.rvfs.challenge.mybank.model.Transaction;
import com.rvfs.challenge.mybank.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
