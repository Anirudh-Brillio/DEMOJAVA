package com.Capstone.AdminService.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Capstone.AdminService.Entity.Transaction;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    Optional<Transaction> findByTransactionId(String transactionId);
}
