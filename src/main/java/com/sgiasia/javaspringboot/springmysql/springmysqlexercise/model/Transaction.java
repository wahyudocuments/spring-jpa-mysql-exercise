package com.sgiasia.javaspringboot.springmysql.springmysqlexercise.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    private Long id;
    private Date transDate;
    private String transNo;
    private Long amount;
    private String customerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transDate=" + transDate +
                ", transNo='" + transNo + '\'' +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
