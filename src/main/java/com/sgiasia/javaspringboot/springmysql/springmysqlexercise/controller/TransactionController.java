package com.sgiasia.javaspringboot.springmysql.springmysqlexercise.controller;

import com.sgiasia.javaspringboot.springmysql.springmysqlexercise.model.Transaction;
import com.sgiasia.javaspringboot.springmysql.springmysqlexercise.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/transaction")
    public List<Transaction> getAllTransaction(){
        List<Transaction> trx = transactionRepository.findAll();
        return trx;
    }

    @GetMapping("/findbytransno")
    public Optional<Transaction> getTransactionNo(@RequestParam String transNo){
    Transaction transaction = transactionRepository.findByTransNo(transNo);
    return Optional.ofNullable(transaction);
    }
}
