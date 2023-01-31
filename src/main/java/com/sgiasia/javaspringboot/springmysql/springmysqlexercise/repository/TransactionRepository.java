package com.sgiasia.javaspringboot.springmysql.springmysqlexercise.repository;

import com.sgiasia.javaspringboot.springmysql.springmysqlexercise.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction findByTransNo(String transNo);
    Transaction findByCustomerName(String customerName);
}
